package com.jdk8.functions;

import java.util.function.Consumer;

public class Demo01 {
    public static void main(String[] args) {
        printMax(Demo01::getTotal);
    }

    private static void getTotal(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println("sum="+sum);
    }

    private static void printMax(Consumer<int[]> consumer){
        int[] arr = {12,3,2,31};
        consumer.accept(arr);
    }
}
