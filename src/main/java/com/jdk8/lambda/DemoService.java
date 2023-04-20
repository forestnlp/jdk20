package com.jdk8.lambda;

public interface DemoService {

    default void print(String message) {
        System.out.println(message);
    }

    static void printStatic(String message) {
        System.out.println(message);
    }

}
