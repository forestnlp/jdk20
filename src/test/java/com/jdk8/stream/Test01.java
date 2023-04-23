package com.jdk8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {

    @Test
    public void test01(){
        List<String> list = Arrays.asList("aa","bb","cc","dd");
        List<String> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);
    }

}
