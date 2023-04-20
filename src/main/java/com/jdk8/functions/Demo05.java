package com.jdk8.functions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Demo05 {

    public static void main(String[] args) {
        Supplier<User> supplier = ()->{return new User();};
        System.out.println(supplier.get());

        Supplier<User> supplier1 = User::new;
        System.out.println(supplier1.get());

        BiFunction<Integer,String,User> function = User::new;
        User aaa = function.apply(1, "aaa");
        System.out.println(aaa);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class User{
        private int id;
        private String name;
    }
}
