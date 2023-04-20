package com.jdk8.lambda;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        }).start();

        new Thread(() -> {
            System.out.println("hello lambda");
        }).start();
    }
}
