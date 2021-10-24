package com.learnjava.ambassador;

import com.learnjava.service.MockService;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MockTest {

    private MockService mockService = new MockService();

    @RepeatedTest(3)
    void getUsers() {
        mockService.getUsers(100, false);
    }

    @RepeatedTest(3)
    void getUsers_parallel() {
        mockService.getUsers(100, true);
    }

    @RepeatedTest(3)
    void getUsersNoCustomExecutor() {
        //CANTIDAD 10 SOLAMENTE
        mockService.getUsersNoCustomExecutor(10, false);
    }

    @RepeatedTest(3)
    void getUsersNoCustomExecutor_parallel() {
        //CANTIDAD 20 SOLAMENTE
        mockService.getUsersNoCustomExecutor(20, true);
    }

    @RepeatedTest(3)
    void getUsersNoFutureEach() {
        mockService.getUsersNoFutureForEach(100, false);
    }

    @RepeatedTest(3)
    void getUsersNoFutureEach_parallel() {
        mockService.getUsersNoFutureForEach(100, true);
    }

    @RepeatedTest(3)
    void getUsersNoFutureForEachAndGetHttp() {
        //CANTIDAD 1 SOLAMENTE
        mockService.getUsersNoFutureForEachAndGetHttp(1, false);
    }

    @RepeatedTest(3)
    void getUsersNoFutureForEachAndGetHttp_parallel() {
        //CANTIDAD 1 SOLAMENTE
        mockService.getUsersNoFutureForEachAndGetHttp(1, true);
    }
}
