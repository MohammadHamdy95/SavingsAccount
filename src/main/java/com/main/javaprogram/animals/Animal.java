package com.main.javaprogram.animals;

public class Animal {
    private String name;
    private int age;
    private boolean hasOwner;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, boolean hasOwner) {
        this.name = name;
        this.age = age;
        this.hasOwner = hasOwner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animals name: " + name;
    }
}
