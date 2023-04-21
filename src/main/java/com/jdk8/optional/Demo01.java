package com.jdk8.optional;

import java.util.Optional;

public class Demo01 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("aa");
        Optional<String> op2 = Optional.ofNullable(null);
        Optional<String> op3 = Optional.empty();

        System.out.println(op1.get());
//        System.out.println(op2.get());
//        System.out.println(op3.get());
        op1.ifPresent(s -> System.out.println("op1==" + s));
        op2.ifPresent(s -> System.out.println("op2==" + s));

        String hello = op3.orElse("hello");
        System.out.println(op3);

        String s = op3.orElseGet(() -> {
            return "aaa";
        });
        System.out.println(s);

    }
}
