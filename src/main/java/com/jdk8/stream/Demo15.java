package com.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo15 {
    public static void main(String[] args) {
        String[] arr = {"aa","bb","cc","dd","aa","bb"};
        List<String> collect = Stream.of(arr).collect(Collectors.toList());
        System.out.println(collect);

        Set<String> collect1 = Stream.of(arr).collect(Collectors.toSet());
        System.out.println(collect1);

        ArrayList<String> collect2 = Stream.of(arr).collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(collect2);

        ArrayList<String> collect3 = Stream.of(arr).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect3);

        Set<String> collect4 = Stream.of(arr).collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect4);
    }
}
