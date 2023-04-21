package com.jdk8.instant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustDemo {
    public static void main(String[] args) {
        TemporalAdjuster adjuster = temporal -> {
            LocalDateTime now = (LocalDateTime)temporal;
            now = now.plusMonths(1).withDayOfMonth(1);
            return now;
        };
        LocalDateTime nextMonth = LocalDateTime.now().with(adjuster);
        System.out.println(nextMonth);

        LocalDateTime with = LocalDateTime.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(with);
    }
}
