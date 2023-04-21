package com.jdk8.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo03 {
    public static void main(String[] args) {
        LocalTime of = LocalTime.of(5, 12, 33,10203 );
        System.out.println(of);

        LocalDateTime of1 = LocalDateTime.of(2023, 3, 26, 17, 30, 22, 1000);
        System.out.println(of1);
    }
}
