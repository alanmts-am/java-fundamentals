package com.alanmtsam.exercises.exercise06;

public class Main {
    public static void main(String[] args) {
        // Box<String> name = new Box<String>();
        // name.set("Hello, world!");
        // System.out.println(name.get());

        Par<String, Integer> user = new Par<String, Integer>("ID_USER", 99);

        System.out.println("Key: " + user.getKey() + " Value: " + user.getValue());

    }
}
