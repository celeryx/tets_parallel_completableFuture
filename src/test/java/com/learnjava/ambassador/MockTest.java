package com.learnjava.ambassador;

import com.learnjava.service.MockService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

class MockTest {

    private MockService mockService = new MockService();

    //cantidad de elemntos para los FOR.
    // son 11 loops.
    // por lo tanto 11 * 720 = 7920 request en el mismo MS
    // modificar este valor si su mock local no lo resiste. I/O REQUEST EXCEPTION
    Integer cantidad = 720;

    @RepeatedTest(3)
    void getUsers() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers(cantidad, false);
    }

    @RepeatedTest(3)
    void getUsers_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers(cantidad, true);
    }

    @RepeatedTest(3)
    void getUsers_CacheTP() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers_CacheThreadPool(cantidad, false);
    }

    @RepeatedTest(3)
    void getUsers_CacheTP_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers_CacheThreadPool(cantidad, true);
    }


    @RepeatedTest(3)
    void getUsersNoCustomExecutor() {
        //CANTIDAD 10 SOLAMENTE
        mockService.getUsersNoCustomExecutor(5, false);
    }

    @RepeatedTest(3)
    void getUsersNoCustomExecutor_parallel() {
        //CANTIDAD 20 SOLAMENTE
        mockService.getUsersNoCustomExecutor(2, true);
    }

    @RepeatedTest(3)
    void getUsersNoFutureEach() {
        mockService.getUsersNoFutureForEach(5, false);
    }

    @RepeatedTest(3)
    void getUsersNoFutureForEach_CacheThreadPool() {
        mockService.getUsersNoFutureForEach_CacheThreadPool(10, false);
    }

    @RepeatedTest(3)
    void getUsersNoFutureEach_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsersNoFutureForEach(cantidad, true);
    }

    @RepeatedTest(3)
    void getUsersNoFutureForEach_CacheThreadPool_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsersNoFutureForEach_CacheThreadPool(cantidad, true);
    }

    @RepeatedTest(3)
    @Disabled
    void getUsersNoFutureForEachAndGetHttp() {
        //CANTIDAD 1 SOLAMENTE
        mockService.getUsersNoFutureForEachAndGetHttp(2, false);
    }

    @RepeatedTest(3)
    void getUsersNoFutureForEachAndGetHttp_parallel() {
        //CANTIDAD 1 SOLAMENTE
        mockService.getUsersNoFutureForEachAndGetHttp(1, true);
    }

    @RepeatedTest(3)
    void getUsersLambda_CacheThreadPool() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsersLambda_CacheThreadPool(cantidad, false);
    }

    @RepeatedTest(3)
    void getUsersLambda_CacheThreadPool_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsersLambda_CacheThreadPool(cantidad, true);
    }
}
