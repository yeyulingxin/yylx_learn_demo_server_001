package com.yylx.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    // 多线程顺序执行任务，无返回值
    public static void main(String[] args) throws Exception{
//        test1();
        test2();
    }


    private static void test1() {
        List<CompletableFuture<Void>> list = new ArrayList<>();
        CompletableFuture<Void> future0 = CompletableFuture.supplyAsync(() -> {
            System.out.println(0);
            return null;
        });
        list.add(future0);
        for (int i = 1; i < 20; i++) {
            int finalI = i;
            CompletableFuture<Void> future = list.get(list.size() - 1).thenRun(() -> {
                System.out.println(finalI);
            });
            list.add(future);
        }
        list.get(list.size() - 1).join();
    }

    private static void test2() throws Exception{
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int finalI = i;
            Thread thread = new Thread(() -> {
                System.out.println(finalI);
            });
            list.add(thread);
        }
        for (Thread thread : list) {
            thread.start();
            Thread.sleep(1000);
            thread.join();
        }
    }
}
