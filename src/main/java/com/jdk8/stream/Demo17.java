package com.jdk8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo17 {
    public static void main(String[] args) {
        User user1 = new User(1,"liujie",39);
        User user2 = new User(2,"xujinyong",42);
        User user3 = new User(3,"xxj",50);
        User user4 = new User(4,"yup",36);
        User user5 = new User(5,"zhenglij",37);
        User user6 = new User(5,"hpf",37);

        List<User> list = Arrays.asList(user1,user2,user3,user4,user5,user6);
        Optional<User> min = list.stream().min((u1, u2) -> u1.getAge() - u2.getAge());
        System.out.println(min.get());

        Integer collect = list.stream().collect(Collectors.summingInt(User::getAge));
        System.out.println(collect);

        Double collect1 = list.stream().collect(Collectors.averagingInt(User::getAge));
        System.out.println(collect1);

        Long collect2 = list.stream().collect(Collectors.counting());
        System.out.println(collect2);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class User{
        private int id;
        private String name;
        private int age;
    }
}
