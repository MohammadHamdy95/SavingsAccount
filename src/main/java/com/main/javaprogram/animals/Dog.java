package com.main.javaprogram.animals;

import java.awt.*;

public class Dog extends Animal {
    private Color coatColor = Color.ORANGE;

    public Dog(String name, int age, boolean hasOwner) {
        super(name, age, hasOwner);
    }

    public Dog(String name, int age, boolean hasOwner, Color coatColor) {
        super(name, age, hasOwner);
        this.coatColor = coatColor;
    }

    public Color getCoatColor() {
        return coatColor;
    }
}
