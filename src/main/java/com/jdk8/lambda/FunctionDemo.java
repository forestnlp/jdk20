package com.jdk8.lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        test2(msg->{
            return Integer.parseInt(msg);
        },msg2->{
            return msg2*10;
        });
    }

    public static void test(Function<String,Integer> function){
        Integer apply = function.apply("6666");
        System.out.println("apply  = "+ apply);
    }

    public static void test2(Function<String,Integer> function1,Function<Integer,Integer> function2){
        Integer apply = function1.andThen(function2).apply("6666");
        System.out.println("apply  = "+ apply);
    }
}
