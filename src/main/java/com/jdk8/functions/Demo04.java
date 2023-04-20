package com.jdk8.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo04 {

    public static void main(String[] args) {
        Function<String,Integer> function = (s)->{
            return s.length();
        };
        System.out.println(function.apply("helloworld"));

        Function<String,Integer> function1 = String::length;
        System.out.println(function1.apply("hhhhhhhahah"));

        BiFunction<String,Integer,String> function2 = String::substring;
        String sun = function2.apply("heelasldlalsd", 3);
        System.out.println(sun);
    }
}
