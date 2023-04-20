package com.jdk8.functions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo06 {

    public static void main(String[] args) {
        Function<Integer,String[]> fun1 = (len)->{
            return new String[len];
        };

        String[] a1 = fun1.apply(3);
        System.out.println(a1.length);

        Function<Integer,String[]> fun2 = String[]::new;
        String[] apply = fun2.apply(5);
        System.out.println(apply.length);
    }
}
