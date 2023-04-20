package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo11_Reduce {
    public static void main(String[] args) {
        Integer[] arr = {123, 5, 3, 5, 724511, 857, 432, 73, 5432, 652, 36, 70563, 23};
        Integer sum = Stream.of(arr).reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        Integer reduce = Stream.of(arr).reduce(0, (x, y) -> x > y ? x : y);
        System.out.println(reduce);
    }
}
