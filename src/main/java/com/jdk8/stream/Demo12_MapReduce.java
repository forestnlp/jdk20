package com.jdk8.stream;

import com.jdk8.lambda.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo12_MapReduce {

    public static void main(String[] args) {

        User user1 = new User(1,"liujie",39);
        User user2 = new User(2,"xujinyong",42);
        User user3 = new User(3,"xxj",50);
        User user4 = new User(4,"yup",36);
        User user5 = new User(5,"zhenglij",37);
        User user6 = new User(5,"hpf",37);

        List<User> list = Arrays.asList(user1,user2,user3,user4,user5,user6);

        Integer reduce = list.stream().map(User::getAge).reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class User{
        private int id;
        private String name;
        private int age;
    }
}
