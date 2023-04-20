package com.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo01 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("liujie","alice","bob","laozi","孔子","秦始皇","释迦摩尼","摩西","耶稣","道德经");
        list.stream().filter(s->s.contains("i")).filter(s -> s.length()>5).forEach(System.out::println);

        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        int len = 20;
        for (int i = 0; i < len; i++) {
            list1.add(random.nextInt(100));
        }
        System.out.println(list1);
        list1.stream().filter(i->i>50).filter(i->i%2==1).forEach(System.out::println);
    }
}
