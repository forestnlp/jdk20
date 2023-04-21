package com.jdk8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo05 {
    public static void main(String[] args) {
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String format = isoLocalDateTime.format(LocalDateTime.now());
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm/ss");
        String format1 = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(format1);

        LocalDateTime parse = LocalDateTime.parse("2021-03-05 15:33/55", dateTimeFormatter);
        System.out.println(parse);
    }
}
