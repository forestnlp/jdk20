package com.jdk8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        fun1(()->{
           int arr[] = {23,132,5,65321,4132,123};
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
    }

    private static void fun1(Supplier<Integer> supplier){
        Integer max = supplier.get();
        System.out.println("max = "+max);
    }
}
