package com.learnjava.service;

import com.learnjava.ambassador.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static com.learnjava.util.CommonUtil.startTimer;
import static com.learnjava.util.CommonUtil.timeTaken;

public class MockService {

    private Mock mock = new Mock();


    public void getUsers(Integer cantidad, boolean isParallel) {

        ExecutorService yourOwnExecutor = Executors.newFixedThreadPool(20000);

        List<CompletableFuture> listFutures = new ArrayList<>();

        IntStream is = IntStream.rangeClosed(0, cantidad);
        IntStream is1 = IntStream.rangeClosed(0, cantidad);
        IntStream is2 = IntStream.rangeClosed(0, cantidad);
        IntStream is3 = IntStream.rangeClosed(0, cantidad);
        IntStream is4 = IntStream.rangeClosed(0, cantidad);
        IntStream is5 = IntStream.rangeClosed(0, cantidad);
        IntStream is6 = IntStream.rangeClosed(0, cantidad);
        IntStream is7 = IntStream.rangeClosed(0, cantidad);
        IntStream is8 = IntStream.rangeClosed(0, cantidad);
        IntStream is9 = IntStream.rangeClosed(0, cantidad);
        IntStream is10 = IntStream.rangeClosed(0, cantidad);

        if (isParallel) {
            is.parallel();
            is1.parallel();
            is2.parallel();
            is3.parallel();
            is4.parallel();
            is5.parallel();
            is6.parallel();
            is7.parallel();
            is8.parallel();
            is9.parallel();
            is10.parallel();
        }


        startTimer();

        CompletableFuture cf1 = CompletableFuture.runAsync(() -> is.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf2 = CompletableFuture.runAsync(() -> is1.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf3 = CompletableFuture.runAsync(() -> is2.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf4 = CompletableFuture.runAsync(() -> is3.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf5 = CompletableFuture.runAsync(() -> is4.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        System.out.println("MITAD DEL FLUJO");

        CompletableFuture cf6 = CompletableFuture.runAsync(() -> is5.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf7 = CompletableFuture.runAsync(() -> is6.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf8 = CompletableFuture.runAsync(() -> is7.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf9 = CompletableFuture.runAsync(() -> is8.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf10 = CompletableFuture.runAsync(() -> is9.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        CompletableFuture cf11 = CompletableFuture.runAsync(() -> is10.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        }));

        System.out.println("WAITING ALL FOREACH");
        CompletableFuture allForEach = CompletableFuture.allOf(cf1, cf2, cf3, cf4, cf5, cf6, cf7, cf8, cf9, cf10, cf11);
        allForEach.join();
        System.out.println("FINISH ALL FOREACH");

        System.out.println("WAITING ALL GET");

        CompletableFuture[] completableFuturesArray = new CompletableFuture[listFutures.size()];
        listFutures.toArray(completableFuturesArray);
        CompletableFuture all = CompletableFuture.allOf(completableFuturesArray);
        all.join();
        System.out.println("FINISH ALL GET");

        timeTaken();

    }

    public void getUsersNoCustomExecutor(Integer cantidad, boolean isParallel) {

        List<CompletableFuture> listFutures = new ArrayList<>();

        IntStream is = IntStream.rangeClosed(0, cantidad);
        IntStream is1 = IntStream.rangeClosed(0, cantidad);
        IntStream is2 = IntStream.rangeClosed(0, cantidad);
        IntStream is3 = IntStream.rangeClosed(0, cantidad);
        IntStream is4 = IntStream.rangeClosed(0, cantidad);
        IntStream is5 = IntStream.rangeClosed(0, cantidad);
        IntStream is6 = IntStream.rangeClosed(0, cantidad);
        IntStream is7 = IntStream.rangeClosed(0, cantidad);
        IntStream is8 = IntStream.rangeClosed(0, cantidad);
        IntStream is9 = IntStream.rangeClosed(0, cantidad);
        IntStream is10 = IntStream.rangeClosed(0, cantidad);

        if (isParallel) {
            is.parallel();
            is1.parallel();
            is2.parallel();
            is3.parallel();
            is4.parallel();
            is5.parallel();
            is6.parallel();
            is7.parallel();
            is8.parallel();
            is9.parallel();
            is10.parallel();
        }


        startTimer();

        CompletableFuture cf1 = CompletableFuture.runAsync(() -> is.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf2 = CompletableFuture.runAsync(() -> is1.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf3 = CompletableFuture.runAsync(() -> is2.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf4 = CompletableFuture.runAsync(() -> is3.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf5 = CompletableFuture.runAsync(() -> is4.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        System.out.println("MITAD DEL FLUJO");

        CompletableFuture cf6 = CompletableFuture.runAsync(() -> is5.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf7 = CompletableFuture.runAsync(() -> is6.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf8 = CompletableFuture.runAsync(() -> is7.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf9 = CompletableFuture.runAsync(() -> is8.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf10 = CompletableFuture.runAsync(() -> is9.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        CompletableFuture cf11 = CompletableFuture.runAsync(() -> is10.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers()));
        }));

        System.out.println("WAITING ALL FOREACH");
        CompletableFuture allForEach = CompletableFuture.allOf(cf1, cf2, cf3, cf4, cf5, cf6, cf7, cf8, cf9, cf10, cf11);
        allForEach.join();
        System.out.println("FINISH ALL FOREACH");

        System.out.println("WAITING ALL GET");

        CompletableFuture[] completableFuturesArray = new CompletableFuture[listFutures.size()];
        listFutures.toArray(completableFuturesArray);
        CompletableFuture all = CompletableFuture.allOf(completableFuturesArray);
        all.join();
        System.out.println("FINISH ALL GET");

        timeTaken();

    }

    public void getUsersNoFutureForEach(Integer cantidad, boolean isParallel) {

        ExecutorService yourOwnExecutor = Executors.newFixedThreadPool(20000);

        List<CompletableFuture> listFutures = new ArrayList<>();

        IntStream is = IntStream.rangeClosed(0, cantidad);
        IntStream is1 = IntStream.rangeClosed(0, cantidad);
        IntStream is2 = IntStream.rangeClosed(0, cantidad);
        IntStream is3 = IntStream.rangeClosed(0, cantidad);
        IntStream is4 = IntStream.rangeClosed(0, cantidad);
        IntStream is5 = IntStream.rangeClosed(0, cantidad);
        IntStream is6 = IntStream.rangeClosed(0, cantidad);
        IntStream is7 = IntStream.rangeClosed(0, cantidad);
        IntStream is8 = IntStream.rangeClosed(0, cantidad);
        IntStream is9 = IntStream.rangeClosed(0, cantidad);
        IntStream is10 = IntStream.rangeClosed(0, cantidad);

        if (isParallel) {
            is.parallel();
            is1.parallel();
            is2.parallel();
            is3.parallel();
            is4.parallel();
            is5.parallel();
            is6.parallel();
            is7.parallel();
            is8.parallel();
            is9.parallel();
            is10.parallel();
        }


        startTimer();

        is.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

       is1.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

       is2.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is3.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is4.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        System.out.println("MITAD DEL FLUJO");

        is5.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is6.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is7.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is8.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is9.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        is10.forEach(i -> {
            listFutures.add(CompletableFuture.supplyAsync(() -> mock.getUsers(), yourOwnExecutor));
        });

        System.out.println("WAITING ALL GET");

        CompletableFuture[] completableFuturesArray = new CompletableFuture[listFutures.size()];
        listFutures.toArray(completableFuturesArray);
        CompletableFuture all = CompletableFuture.allOf(completableFuturesArray);
        all.join();
        System.out.println("FINISH ALL GET");

        timeTaken();

    }

    public void getUsersNoFutureForEachAndGetHttp(Integer cantidad, boolean isParallel) {

        IntStream is = IntStream.rangeClosed(0, cantidad);
        IntStream is1 = IntStream.rangeClosed(0, cantidad);
        IntStream is2 = IntStream.rangeClosed(0, cantidad);
        IntStream is3 = IntStream.rangeClosed(0, cantidad);
        IntStream is4 = IntStream.rangeClosed(0, cantidad);
        IntStream is5 = IntStream.rangeClosed(0, cantidad);
        IntStream is6 = IntStream.rangeClosed(0, cantidad);
        IntStream is7 = IntStream.rangeClosed(0, cantidad);
        IntStream is8 = IntStream.rangeClosed(0, cantidad);
        IntStream is9 = IntStream.rangeClosed(0, cantidad);
        IntStream is10 = IntStream.rangeClosed(0, cantidad);

        if (isParallel) {
            is.parallel();
            is1.parallel();
            is2.parallel();
            is3.parallel();
            is4.parallel();
            is5.parallel();
            is6.parallel();
            is7.parallel();
            is8.parallel();
            is9.parallel();
            is10.parallel();
        }


        startTimer();

        is.forEach(i -> {
            mock.getUsers();
        });

        is1.forEach(i -> {
            mock.getUsers();
        });

        is2.forEach(i -> {
            mock.getUsers();
        });

        is3.forEach(i -> {
            mock.getUsers();
        });

        is4.forEach(i -> {
            mock.getUsers();
        });

        System.out.println("MITAD DEL FLUJO");

        is5.forEach(i -> {
            mock.getUsers();
        });

        is6.forEach(i -> {
            mock.getUsers();
        });

        is7.forEach(i -> {
            mock.getUsers();
        });

        is8.forEach(i -> {
            mock.getUsers();
        });

        is9.forEach(i -> {
            mock.getUsers();
        });

        is10.forEach(i -> {
            mock.getUsers();
        });


        System.out.println("FINISH ALL GET");

        timeTaken();

    }

}
