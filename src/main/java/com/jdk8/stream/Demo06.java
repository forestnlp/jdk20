package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo06 {
    public static void main(String[] args) {
        Stream.of(65, 668, 99, 100, 101, 5, 67, 68, 69, 97, 9).sorted().sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }
}
