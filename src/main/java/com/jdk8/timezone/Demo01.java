package com.jdk8.timezone;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo01 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        ZonedDateTime now = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("nowutc="+now);


        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemDefaultZone());
        System.out.println(now1);

        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("America/Caracas"));
        System.out.println(now2);

    }
}
