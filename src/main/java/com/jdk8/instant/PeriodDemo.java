package com.jdk8.instant;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate of = LocalDate.of(2021, 3, 11);
        Period between = Period.between(now, of);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
    }
}
