package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo10 {
    public static void main(String[] args) {
        Integer[] arr = {123, 5, 3, 5, 7245, 857, 432, 73, 5432, 652, 36, 7563, 23};
        System.out.println(Stream.of(arr).max(((o1, o2) -> o1-o2)).get());
        System.out.println(Stream.of(arr).min(((o1, o2) -> o1-o2)).get());
    }
}
