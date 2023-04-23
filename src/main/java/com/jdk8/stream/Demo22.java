package com.jdk8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo22 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        List<Integer> finalList = Collections.synchronizedList(list);
        IntStream.range(1,10000).parallel().forEach(i->{
            finalList.add(i);
        });
        System.out.println(list.size());
    }
}
