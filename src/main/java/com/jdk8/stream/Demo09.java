package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo09 {
    public static void main(String[] args) {
        Integer[] arr = {123, 5, 3, 5, 7245, 857, 432, 73, 5432, 652, 36, 7563, 23};
        System.out.println(Stream.of(arr)
                .findFirst().get());
        System.out.println(Stream.of(arr)
                .findAny().get());

    }
}
