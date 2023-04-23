package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo13 {
    public static void main(String[] args) {
        Integer[] arr = {123,213,123,64,4,123,789,6,78};
        Integer[] arr2 = {1234,213123,123123,624,41,1213,7289,6,178};
        Stream<Integer> arr21 = Stream.of(arr2);

        Stream.of(arr).mapToInt(Integer::intValue).sorted().filter(i->i>55).forEach(System.out::println);

        System.out.println("----------concat-----------");

        Stream<Integer> stream1 = Stream.of(arr);
        Stream<Integer> stream2 = Stream.of(arr2);
        Stream.concat(stream1,stream2).sorted().distinct().forEach(System.out::println);

    }
}
