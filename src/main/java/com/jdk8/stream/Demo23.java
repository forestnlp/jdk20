package com.jdk8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Demo23 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Object o = new Object();
        IntStream.range(1,10000).parallel().forEach(i->{
            synchronized (o){
                list.add(i);
            }
        });
        System.out.println(list.size());
    }
}
