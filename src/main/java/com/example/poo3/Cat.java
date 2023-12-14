package com.example.poo3;

import java.util.ArrayList;

class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight, new ArrayList<>());
        getAbilities().add("agility");
    }

    @Override
    public String sound() {
        return "meow";
    }
}