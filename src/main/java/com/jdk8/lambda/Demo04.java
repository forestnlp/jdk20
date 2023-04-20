package com.jdk8.lambda;

public class Demo04 {
    public static void main(String[] args) {
        DemoService.printStatic("hello static method");
        new DemoService(){}.print("message");
    }
}
