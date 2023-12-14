package com.example.poo3;

import java.util.ArrayList;

class Animal {
    private static long nextId = 1;

    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> abilities;

    public Animal(String name, int age, double weight, ArrayList<String> abilities) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = abilities;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public String sound() {
        return "Default sound";
    }

    public String performAbility(String ability) {
        if (abilities.contains(ability)) {
            return name + " can " + ability;
        } else {
            return name + " can't " + ability;
        }
    }
}