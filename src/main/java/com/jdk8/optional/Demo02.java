package com.jdk8.optional;

import java.util.Locale;
import java.util.Optional;

public class Demo02 {
    public static void main(String[] args) {
        Optional<String> op = Optional.empty();
        op.ifPresent(System.out::println);

        Optional<Person> optional = Optional.of(new Person("aaaasd"));
        if (optional.isPresent()) {
            System.out.println(optional.map(person -> person.getName()).map(name -> name.toUpperCase()).orElse("kong"));
            System.out.println(optional.map(Person::getName).map(String::toUpperCase).orElse("kong"));
        }
    }

    private static class Person {
        private String name;

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
