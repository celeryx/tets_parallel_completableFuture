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

    @RepeatedTest(5)
    void getUsers() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers(cantidad, false);
    }

    @RepeatedTest(5)
    void getUsers_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers(cantidad, true);
    }

    @RepeatedTest(5)
    void getUsers_CacheTP() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers_CacheThreadPool(cantidad, false);
    }

    @RepeatedTest(5)
    void getUsers_CacheTP_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsers_CacheThreadPool(cantidad, true);
    }


    @RepeatedTest(5)
    @Disabled
    void getUsersNoCustomExecutor() {
        //CANTIDAD 10 SOLAMENTE
        mockService.getUsersNoCustomExecutor(10, false);
    }

    @RepeatedTest(5)
    @Disabled
    void getUsersNoCustomExecutor_parallel() {
        //CANTIDAD 20 SOLAMENTE
        mockService.getUsersNoCustomExecutor(20, true);
    }

    @RepeatedTest(5)
    @Disabled
    void getUsersNoFutureEach() {
        mockService.getUsersNoFutureForEach(50, false);
    }

    @RepeatedTest(5)
    @Disabled
    void getUsersNoFutureForEach_CacheThreadPool() {
        mockService.getUsersNoFutureForEach_CacheThreadPool(50, false);
    }

    @RepeatedTest(5)
    void getUsersNoFutureEach_parallel() {
        mockService.getUsersNoFutureForEach(cantidad, true);
    }

    @RepeatedTest(5)
    void getUsersNoFutureForEach_CacheThreadPool_parallel() {
        mockService.getUsersNoFutureForEach_CacheThreadPool(cantidad, true);
    }

    @RepeatedTest(5)
    @Disabled
    void getUsersNoFutureForEachAndGetHttp() {
        //CANTIDAD 1 SOLAMENTE
        mockService.getUsersNoFutureForEachAndGetHttp(1, false);
    }

    @RepeatedTest(5)
    @Disabled
    void getUsersNoFutureForEachAndGetHttp_parallel() {
        //CANTIDAD 1 SOLAMENTE
        mockService.getUsersNoFutureForEachAndGetHttp(1, true);
    }

    @RepeatedTest(5)
    void getUsersLambda_CacheThreadPool() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsersLambda_CacheThreadPool(cantidad, false);
    }

    @RepeatedTest(5)
    void getUsersLambda_CacheThreadPool_parallel() throws InterruptedException {
        Thread.sleep(5000);
        mockService.getUsersLambda_CacheThreadPool(cantidad, true);
    }
}
