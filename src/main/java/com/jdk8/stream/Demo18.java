package com.jdk8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo18 {
    public static void main(String[] args) {
        User user1 = new User(1,"liujie",39);
        User user2 = new User(2,"xujinyong",42);
        User user3 = new User(3,"xxj",50);
        User user4 = new User(4,"yup",36);
        User user5 = new User(5,"zhenglij",37);
        User user6 = new User(5,"hpf",37);

        List<User> list = Arrays.asList(user1,user2,user3,user4,user5,user6);
        Map<Integer, List<User>> collect = list.stream().collect(Collectors.groupingBy(User::getAge));
        collect.forEach((k,v)-> System.out.println(k+":"+v));

        Map<String, List<User>> collect2 = list.stream().collect(Collectors.groupingBy(p->p.getAge()>=40?"40以下":"40以上"));
        collect2.forEach((k,v)-> System.out.println(k+":"+v));
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
