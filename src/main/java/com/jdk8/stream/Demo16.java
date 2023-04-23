package com.jdk8.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo16 {
    public static void main(String[] args) {
        String[] arr = {"aa", "bb", "cc", "dd", "aa", "bb"};
        Object[] objects = Stream.of(arr).toArray();
        String[] strings = Stream.of(arr).toArray(String[]::new);
        for (Object o : objects) {
            System.out.println(o);
        }
        for (String o : strings) {
            System.out.println(o);
        }

    }
}
