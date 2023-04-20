package com.jdk8.lambda;

public class Demo02 {

    public static void save(UserService service){
        service.dosave();
    }

    public static void main(String[] args) {
        save(new UserService() {
            @Override
            public void dosave() {
                System.out.println("class call is saving");
            }
        });

        save(()->{
            System.out.println("lambda call saving");
        });
    }
}
