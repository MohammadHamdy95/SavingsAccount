package com.main.javaprogram;

import com.main.javaprogram.animals.Animal;
import com.main.javaprogram.animals.Dog;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(500);
        System.out.println(savings.withdrawal(25));
        SavingsAccount kylesavings = new SavingsAccount(100000000, "kyle savings");
        kylesavings.withdrawal(500000);

        Dog Lucky = new Dog("Lucky", 12, true, Color.black);
        Dog dog = new Dog("Lucky", 12, true);

        System.out.println(Lucky);
    }

}
