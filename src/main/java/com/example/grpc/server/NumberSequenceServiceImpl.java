package com.example.grpc.server;

import com.example.grpc.protobuf.generated.NumberSequenceReply;
import com.example.grpc.protobuf.generated.NumberSequenceRequest;
import com.example.grpc.protobuf.generated.NumberSequenceServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.ScheduledExecutorService;

public class NumberSequenceServiceImpl extends NumberSequenceServiceGrpc.NumberSequenceServiceImplBase {

    private final ScheduledExecutorService executorService;

    public NumberSequenceServiceImpl(ScheduledExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public void getNumbers(NumberSequenceRequest request, StreamObserver<NumberSequenceReply> responseObserver) {
        NumberGenerator generator = new NumberGenerator(executorService, responseObserver,
                request.getFirstValue(), request.getLastValue());
        generator.start();
    }

}
