package com.jdk8.lambda;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        test2(msg->{
            System.out.println("msg转换为大写"+msg.toUpperCase());
        },msg->{
            System.out.println("msg转换为小写"+msg.toLowerCase());
        });
    }

    private static void test(Consumer<String> consumer){
        consumer.accept("helloword");
    }

    private static void test2(Consumer<String> consumer1,Consumer<String> consumer2){
        String message = "helloWorld,Java";
        consumer1.andThen(consumer2).accept(message);
    }
}
