package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo05 {
    public static void main(String[] args) {
//        Stream.of(65, 66, 67, 68, 69,97,98,99,100,101).map(msg -> {
//            return (char) msg.intValue();
//        }).forEach(System.out::println);

        Stream.of(65, 66, 67, 68, 69,97,98,99,100,101).map(Math::exp).forEach(System.out::println);
    }
}
