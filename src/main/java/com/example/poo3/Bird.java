package com.example.poo3;

import java.util.ArrayList;

class Bird extends Animal {
    public Bird(String name, int age, double weight) {
        super(name, age, weight, new ArrayList<>());
        getAbilities().add("fly");
    }

    @Override
    public String sound() {
        return "piu";
    }
}