package com.jdk8.lambda;

import com.jdk8.lambda.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {

        User user01 = new User(1,"alice",110);
        User user02 = new User(2,"bob",19);
        User user03 = new User(3, "eve", 12);

        List<User> list = new ArrayList<>();
        list.add(user01);
        list.add(user02);
        list.add(user03);

        Collections.sort(list,(u1,u2)->{
            return u1.getLevel()-u2.getLevel();
        });

        System.out.println(list);
    }
}
