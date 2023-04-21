package com.jdk8.instant;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalTime of = LocalTime.of(22, 51, 19);
        Duration between = Duration.between(LocalTime.now(), of);
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toMillis()/1000);
    }
}
