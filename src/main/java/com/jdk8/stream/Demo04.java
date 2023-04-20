package com.jdk8.stream;

import java.util.stream.Stream;

public class Demo04 {

    public static void main(String[] args) {

        String[] arrays = {"aa", "bb", "cc", "a0a", "bb", "cc", "a1a", "bb", "cc", "a2a", "bb", "cc", "a3a", "bb", "cc"};
        System.out.println(Stream.of(arrays).count());
        System.out.println("limit");
        Stream.of(arrays).limit(7).filter(s -> s.contains("a")).forEach(System.out::println);
        System.out.println("skiping");
        Stream.of(arrays).skip(7).limit(7).filter(s -> s.contains("a")).forEach(System.out::println);

    }

}
