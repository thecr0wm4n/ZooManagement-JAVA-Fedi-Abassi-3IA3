package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {

public static void main(String[] args) {

Animal lion = new Animal("mammal", "lion", 5, true);
Animal elephant = new Animal("mammal", "elephant", 8, true);
Animal giraffe = new Animal("mammal", "giraffe", 7, true);
Animal zebra = new Animal("mammal", "zebra", 5, true);

Zoo myzoo = new Zoo("zoopark", 10, "paris");

//myzoo.animals = new Animal[Zoo.NUMBER_OF_CAGES];
//myzoo.animals[0] = lion;

    System.out.println(myzoo.addAnimal(lion));      
    System.out.println(myzoo.addAnimal(elephant));  
    System.out.println(myzoo.addAnimal(giraffe));   
    System.out.println(myzoo.addAnimal(zebra));

myzoo.displayZoo();


System.out.println(myzoo);
    System.out.println(lion);

    Zoo myzoo1 = new Zoo("zootest", 2, "Tunis");
    
    
    Animal lion1 = new Animal("Feline", "Simba", 5, true);
    myzoo1.addAnimal(lion1);
    Animal lion2 = new Animal("Feline", "Simba", 5, true);
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

    Zoo myzoo2 = new Zoo("Wildlife Park", 5, "Paris");
    
    
    for(int i = 0; i < Zoo.NUMBER_OF_CAGES + 1; i++) {
        Animal animal = new Animal("Family" + i, "Animal" + i, i, true);
        System.out.println("zoo2 is full: " + myzoo2.isZooFull());
        myzoo2.addAnimal(animal);
    }
    
    
    System.out.println("Final state - zoo2 is full: " + myzoo2.isZooFull());

    Zoo Zooplusgrand = Zoo.comparerZoo(myzoo1, myzoo2);
    System.out.println("Zoo with more animals: " + Zooplusgrand.getName());

    Zoo zoo = new Zoo("Aqua Zoo",6, "Miami");

    
    Terrestrial terrestrial = new Terrestrial();
    Dolphin dolphin = new Dolphin("Mammal", "Flipper", 10, true, "Ocean", 37.5f);
    Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 100.0f);
    

    zoo.addAquaticAnimal(dolphin);
    zoo.addAquaticAnimal(penguin);
    

    zoo.displaySwimmingAnimals();
    
    
    
    Terrestrial terrestrial2 = new Terrestrial("Mammal", "Lion", 5, true, "Forest");
    Dolphin dolphin2 = new Dolphin("Mammal", "Flipper", 10, true, "Ocean", 37.5f);
    Penguin penguin2 = new Penguin("Bird", "Pingu", 3, false, "Antarctica", 100.0f);

    
    System.out.println(terrestrial2);
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
}
}

