package com.jdk8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo04 {
    public static void main(String[] args) {
        LocalDate with = LocalDate.now().withYear(2013);
        LocalDate now = LocalDate.now();
        System.out.println(with);
        System.out.println(now);
        System.out.println(with.equals(now));

        LocalDate localDate = now.plusDays(10);
        System.out.println(localDate);
    }
}
