package com.jdk8.annotation;

import java.util.Arrays;

@MyAnnotation("1")
@MyAnnotation("2")
public class Demo01 {
    @MyAnnotation("3")
    public void test(){

    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyAnnotation[] annotationsByType = Demo01.class.getAnnotationsByType(MyAnnotation.class);
        Arrays.stream(annotationsByType).map(s->s.value()).forEach(System.out::println);

        MyAnnotation[] tests = Demo01.class.getMethod("test").getAnnotationsByType(MyAnnotation.class);
        Arrays.stream(tests).map(s->s.value()).forEach(System.out::println);
    }
}
