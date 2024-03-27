package com.example.grpc.client;

import com.example.grpc.protobuf.generated.NumberSequenceReply;
import com.example.grpc.protobuf.generated.NumberSequenceRequest;
import com.example.grpc.protobuf.generated.NumberSequenceServiceGrpc;
import com.example.grpc.utils.SequenceEmitter;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

public class ClientNumberObserver {
    private static final Logger LOGGER = Logger.getLogger(ClientNumberObserver.class.getName());

    private final NumberSequenceServiceGrpc.NumberSequenceServiceStub numberSequenceService;

    private int lastServerValue = 0;

    private int currentValue = -1;

    private final SequenceEmitter sequenceEmitter;

    private final AtomicReference<CountDownLatch> completeLatch;

    public ClientNumberObserver(ScheduledExecutorService executorService, NumberSequenceServiceGrpc.NumberSequenceServiceStub numberSequenceService) {
        this.numberSequenceService = numberSequenceService;
        this.sequenceEmitter = new SequenceEmitter(0, 50,
                1, TimeUnit.SECONDS, executorService, sequenceObserver);
        this.completeLatch = new AtomicReference<>(null);
    }

    public void start() {
        this.completeLatch.set(new CountDownLatch(1));
        NumberSequenceRequest request = NumberSequenceRequest.newBuilder()
                .setFirstValue(0)
                .setLastValue(30)
                .build();
        numberSequenceService.getNumbers(request, new StreamObserver<NumberSequenceReply>() {
            @Override
            public void onNext(NumberSequenceReply value) {
                int newValue = value.getNum();
                LOGGER.info("new value: " + newValue);
                synchronized (ClientNumberObserver.this) {
                    lastServerValue = newValue;
                }
            }


            @Override
            public void onError(Throwable t) {
                LOGGER.warning("Server error " + t);
                stopClientCounter();
            }

            @Override
            public void onCompleted() {
                LOGGER.warning("Server stream completed");
            }
        });
        startClientCounter();
    }

    private void startClientCounter() {
        LOGGER.info("Numbers Client is starting...");
        synchronized (this) {
            currentValue = 0;
            sequenceEmitter.start();
        }
    }

    private void stopClientCounter() {
        sequenceEmitter.stop();
        CountDownLatch latch = completeLatch.getAndSet(null);
        if (latch != null) {
            latch.countDown();
        }
    }

    public void awaitCompletion() throws InterruptedException {
        CountDownLatch latch = completeLatch.get();
        if (latch != null) {
            latch.await();
        }
    }

    private final SequenceEmitter.Observer sequenceObserver = new SequenceEmitter.Observer() {
        @Override
        public void onNext(int counterValue) {
            int newCurrentValue;
            synchronized (ClientNumberObserver.this) {
                newCurrentValue = currentValue = currentValue + lastServerValue + 1;
                lastServerValue = 0;
            }
            LOGGER.info("currentValue: " + newCurrentValue);
        }

        @Override
        public void onEnd() {
            LOGGER.info("Sequence complete");
            CountDownLatch latch = completeLatch.getAndSet(null);
            if (latch != null) {
                latch.countDown();
            }
        }
    };
}
