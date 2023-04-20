package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo08 {
    public static void main(String[] args) {

        Integer[] arr = {123,5,3,5,7245,857,432,73,5432,652,36,7563,23};
        System.out.println(Stream.of(arr).anyMatch(s -> s > 10));
        System.out.println(Stream.of(arr).allMatch(s -> s > 10));
        System.out.println(Stream.of(arr).noneMatch(s -> s > 10));
    }
}
