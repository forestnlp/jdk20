package com.jdk8.lambda;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        test(msg->{
            return msg.length()>=3;
        },"helloworld");
    }

    private static void test(Predicate<String> predicate,String msg){
        boolean test = predicate.test(msg);
        System.out.println("test:="+test);
    }

}
