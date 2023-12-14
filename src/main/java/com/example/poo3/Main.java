package com.example.poo3;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Cat whiskers = new Cat("Whiskers", 3, 5.5);
        Dog buddy = new Dog("Buddy", 4, 8.0);
        Bird tweety = new Bird("Tweety", 2, 0.5);

        zoo.addAnimal(whiskers);
        zoo.addAnimal(buddy);
        zoo.addAnimal(tweety);

        System.out.println("Lista de animais no zoológico:");
        for (Animal animal : zoo.listAnimals()) {
            System.out.println(animal.getName() + " - Sound: " + animal.sound());
            System.out.println(animal.performAbility("sniff"));
            System.out.println("==============================");
        }

        long idToRemove = buddy.getId();
        if (zoo.removeAnimal(idToRemove)) {
            System.out.println("O animal com ID " + idToRemove + " foi removido.");
        } else {
            System.out.println("Nenhum animal encontrado com ID " + idToRemove + ".");
        }

        System.out.println("\nLista de animais no zoológico após a remoção:");
        for (Animal animal : zoo.listAnimals()) {
            System.out.println(animal.getName() + " - Sound: " + animal.sound());
            System.out.println(animal.performAbility("sniff"));
            System.out.println("==============================");
        }
    }
}