package com.jdk8.annotation;

public class Demo02<@TypeParam T> {

    public <@TypeParam K extends Object> K test(){
        return null;
    }

}
