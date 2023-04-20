package com.jdk8.functions;

import com.jdk8.lambda.UserService;

import java.util.Date;
import java.util.function.Supplier;

public class Demo03 {

    public static void main(String[] args) {
        Supplier<Long> supplier1 = () -> {
            return System.currentTimeMillis();
        };
        Supplier<Long> currentTimeMillis = System::currentTimeMillis;
        System.out.println(currentTimeMillis.get());
        System.out.println(supplier1.get());
    }
}
