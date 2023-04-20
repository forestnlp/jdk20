package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo07 {
    public static void main(String[] args) {
        Stream.of(65, 100, 99, 100, 101, 5, 100, 100, 69, 100, 9).distinct().sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }
}
