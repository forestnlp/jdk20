package com.jdk8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo21 {
    public static void main(String[] args) {
        User user1 = new User(1, "cc", 39);
        User user2 = new User(2, "bb", 42);
        User user3 = new User(3, "aa", 50);
        User user4 = new User(4, "aa", 36);
        User user5 = new User(5, "ee", 37);
        User user6 = new User(5, "dd", 37);

        List<User> list = Arrays.asList(user1, user2, user3, user4, user5, user6);

        list.stream().parallel().forEach(s->{
            System.out.println("Thread:"+Thread.currentThread().getName()+":"+s);
        });
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class User {
        private int id;
        private String name;
        private int age;
    }
}
