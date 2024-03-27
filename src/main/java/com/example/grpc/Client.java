package com.example.grpc;

import com.example.grpc.protobuf.generated.NumberSequenceServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.grpc.client.ClientNumberObserver;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(2);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();

        try {
            ClientNumberObserver clientNumberObserver = new ClientNumberObserver(executorService, NumberSequenceServiceGrpc.newStub(channel));
            clientNumberObserver.start();
            clientNumberObserver.awaitCompletion();
        } finally {
            executorService.shutdown();
        }
    }
}
