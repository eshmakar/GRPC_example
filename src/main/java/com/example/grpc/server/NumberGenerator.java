package com.example.grpc.server;

import com.example.grpc.protobuf.generated.NumberSequenceReply;
import com.example.grpc.utils.SequenceEmitter;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

class NumberGenerator {
    private static final Logger LOGGER = Logger.getLogger(NumberGenerator.class.getName());

    private final SequenceEmitter sequenceEmitter;

    NumberGenerator(ScheduledExecutorService executorService, final StreamObserver<NumberSequenceReply> observer, int firstValue, int lastValue) {
        SequenceEmitter.Observer sequenceObserver = new SequenceEmitter.Observer() {
            @Override
            public void onNext(int currentValue) {
                LOGGER.info("SENDING VALUE " + currentValue);
                synchronized (observer) {
                    observer.onNext(NumberSequenceReply.newBuilder().setNum(currentValue).build());
                }
            }

            @Override
            public void onEnd() {
                LOGGER.info("Sending complete notification");
                synchronized (observer) {
                    observer.onCompleted();
                }
            }
        };
        this.sequenceEmitter = new SequenceEmitter(firstValue, lastValue,
                2, TimeUnit.SECONDS, executorService, sequenceObserver);
    }

    public void start() {
        LOGGER.info("Start emitting sequence");
        sequenceEmitter.start();
    }

}
