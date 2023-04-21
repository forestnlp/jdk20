package com.jdk8.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Date date = new Date(2023, 4, 21);
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));

        for (int i = 0; i < 240; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(sdf.parse("2021-03-25"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
