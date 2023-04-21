package com.jdk8.annotation;

public class Demo03 {

    private @NotNull int age;

    public void test(@NotNull int i){
        this.age = i;
    }
}
