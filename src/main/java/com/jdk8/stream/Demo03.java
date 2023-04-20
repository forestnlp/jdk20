package com.jdk8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Demo03 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a1", "b2", "c3");
        stream.forEach(System.out::println);

        String[] strings = {"123,","44123","312asd"};
        Stream<String> strings1 = Stream.of(strings);
        strings1.forEach(System.out::println);
    }
}
