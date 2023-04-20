package com.jdk8.functions;

import java.util.Date;
import java.util.function.Supplier;

public class Demo02 {

    public static void main(String[] args) {
        Date date = new Date();
        Supplier<Long> supplier = ()->{
            return date.getTime();
        };
        System.out.println(supplier.get());

        Supplier<Long> supplier1 = date::getTime;
        System.out.println(supplier1.get());
    }
}
