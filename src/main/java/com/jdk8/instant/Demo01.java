package com.jdk8.instant;

import java.time.Instant;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now();
        Thread.sleep(1000);
        Instant now1 = Instant.now();
        System.out.println(now1.getNano()-now.getNano());
    }
}
