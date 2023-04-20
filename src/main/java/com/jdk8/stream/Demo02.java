package com.jdk8.stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo02 {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",1);
        map.put("bbb",2);
        map.put("ccc",3);
        Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();
        stream.forEach(System.out::println);
    }
}
