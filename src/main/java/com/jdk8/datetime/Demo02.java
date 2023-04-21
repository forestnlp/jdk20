package com.jdk8.datetime;

import java.time.LocalDate;

public class Demo02 {
    public static void main(String[] args) {
        LocalDate of = LocalDate.of(2023, 03, 26);
        System.out.println(of);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        String s = String.valueOf(now.getYear())+now.getMonth().getValue()+now.getDayOfMonth();
        System.out.println(s);
    }
}
