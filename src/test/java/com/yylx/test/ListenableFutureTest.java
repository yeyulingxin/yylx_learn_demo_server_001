package com.yylx.test;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class ListenableFutureTest {

    public static void main(String[] args){
        final ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            ListenableFuture<String> listenableFuture = service.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
//                    Thread.sleep(1000);
                    return "线程执行逻辑-" + finalI;
                }
            });
            Futures.addCallback(listenableFuture, new FutureCallback<String>() {

                @Override
                public void onSuccess(String s) {
                    System.out.println("执行成功，" + s);
                }

                @Override
                public void onFailure(Throwable throwable) {
                    System.out.println("执行失败");
                }
            }, service);
        }

    }
}
