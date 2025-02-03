import java.util.Scanner;

public class ZooManagement {

public static void main(String[] args) {

Animal lion = new Animal("mammal", "lion", 5, true);
Animal elephant = new Animal("mammal", "elephant", 8, true);
Animal giraffe = new Animal("mammal", "giraffe", 7, true);
Animal zebra = new Animal("mammal", "zebra", 5, true);

Zoo myzoo = new Zoo("zoopark", 10, "paris");

myzoo.animals = new Animal[myzoo.nbrCages];
myzoo.animals[0] = lion;

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
    
    // Test removal
    myzoo1.removeAnimal(elephant);
    
    System.out.println("\nAfter removal:");
    myzoo1.displayAnimals();
    
    
    Animal tiger = new Animal("Feline", "Tiger", 4, true);
    myzoo1.removeAnimal(tiger);
}
}

