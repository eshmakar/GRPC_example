package com.example.grpc;

import com.example.grpc.server.NumberSequenceServiceImpl;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    private final ScheduledExecutorService executorService;

    private final io.grpc.Server grpcServer;

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = new Server();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    server.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
            }
        }));

        server.start();
        server.blockUntilShutdown();
    }

    public Server() {
        this.executorService = new ScheduledThreadPoolExecutor(2);
        this.grpcServer = ServerBuilder.forPort(8090)
                .addService(new NumberSequenceServiceImpl(executorService))
                .build();
    }

    public void start() throws IOException {
        grpcServer.start();
    }

    public void stop() throws InterruptedException {
        executorService.shutdown();
        executorService.awaitTermination(3, TimeUnit.SECONDS);
        grpcServer.shutdown();
    }

    public void blockUntilShutdown() throws InterruptedException {
        grpcServer.awaitTermination();
    }
}
