package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.utils.*;
import java.util.Scanner;

public class ZooManagement {

public static void main(String[] args) {
    try {
        Zoo myzoo = new Zoo("zoopark",1, "paris");
        Animal lion = new Animal("mammal", "lion", 5, true);
        Animal elephant = new Animal("mammal", "elephant", 8, true);
        Animal giraffe = new Animal("mammal", "giraffe", 7, true);
        Animal zebra = new Animal("mammal", "zebra", 5, true);

        myzoo.addAnimal(lion);
        myzoo.addAnimal(elephant);
        myzoo.addAnimal(giraffe);
        myzoo.addAnimal(zebra);

        myzoo.displayZoo();
        System.out.println(myzoo);
        System.out.println(lion);

        Zoo myzoo1 = new Zoo("zootest",10, "Tunis");
        Animal lion1 = new Animal("Feline", "Simba", 5, true);
        Animal lion2 = new Animal("Feline", "Simba", 5, true);
        
        myzoo1.addAnimal(lion1);
        myzoo1.addAnimal(lion2);
        myzoo1.addAnimal(elephant);
        myzoo1.addAnimal(giraffe);
        
        myzoo1.displayAnimals();
        
        int index1 = myzoo1.searchAnimal(lion1);
        System.out.println("First lion found at index: " + index1);    
        int index2 = myzoo1.searchAnimal(lion2);
        System.out.println("Second lion found at index: " + index2);
        
        System.out.println("\nBefore removal:");
        myzoo1.displayAnimals();
        
        myzoo1.removeAnimal(elephant);
        
        System.out.println("\nAfter removal:");
        myzoo1.displayAnimals();
        
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        myzoo1.removeAnimal(tiger);

        Zoo myzoo2 = new Zoo("Wildlife Park",5, "Paris");
        
        //Afin de tester l'exception ZooFullException , utiliser Zoo.NUMBER_OF_CAGES + 1 dans la boucle for
        for(int i = 0; i < Zoo.NUMBER_OF_CAGES ; i++) {
            Animal animal = new Animal("Family" + i, "Animal" + i, i, true);
            System.out.println("zoo2 is full: " + myzoo2.isZooFull());
            myzoo2.addAnimal(animal);
        }
        
        System.out.println("Final state - zoo2 is full: " + myzoo2.isZooFull());

        Zoo Zooplusgrand = Zoo.comparerZoo(myzoo1, myzoo2);
        System.out.println("Zoo with more animals: " + Zooplusgrand.getName());

        Zoo zoo = new Zoo("Aqua Zoo",2, "Miami");

        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 10, true, "Ocean", 37.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 100.0f);
        
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);
        
        zoo.displaySwimmingAnimals();
        
        try {
            Terrestrial terrestrial2 = new Terrestrial("Mammal", "Lion", -2, true,"Forest", 4);
            System.out.println(terrestrial2);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age for terrestrial animal: " + e.getMessage());
        }

        Dolphin dolphin2 = new Dolphin("Mammal", "Flipper", 10, true, "Ocean", 37.5f);
        Penguin penguin2 = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 100.0f);
        
        System.out.println(dolphin2);
        System.out.println(penguin2);
        
        dolphin2.swim();
        penguin2.swim();

        Penguin penguin3 = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 100.0f);
        Penguin penguin4 = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 100.0f);
        
        zoo.addAquaticAnimal(penguin3);
        zoo.addAquaticAnimal(penguin4);

        System.out.println("Max penguin swimming depth: " + zoo.maxPenguinSwimmingDepth());
        
        zoo.displayNumberOfAquaticsByType();
        
        System.out.println("Are dolphins equal? " + dolphin2.equals(dolphin));  
        System.out.println("Are dolphin and penguin equal? " + dolphin2.equals(penguin2));  

        Penguin penguin5 = new Penguin("Bird", "Pingu", -3, false, "Antarctica", 100.0f);
        zoo.addAquaticAnimal(penguin5);

    } catch (InvalidAgeException e) {
        System.out.println("Age Error: " + e.getMessage());
    } catch (ZooFullException e) {
        System.out.println("Zoo Full Error: " + e.getMessage());
    }
}
}
