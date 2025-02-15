package tn.esprit.gestionzoo.entities;


public class Zoo {
    private Animal[] animals;
    private String name;
    public static final int NUMBER_OF_CAGES = 25;
    private String city;
    private int animalCount = 0;

    public Zoo() {
        this.animals = new Animal[NUMBER_OF_CAGES];
    }

    public Zoo(String name, int nbrCages, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NUMBER_OF_CAGES]; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Zoo name cannot be empty");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }
    
    public void displayZoo() {
        System.out.println("Zoo name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of cages: " + NUMBER_OF_CAGES);
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < NUMBER_OF_CAGES; i++) {
            if (this.animals[i] != null) {
                System.out.println(this.animals[i].getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + NUMBER_OF_CAGES + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full! Cannot add more animals.");
            return false;
        }
        
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("This animal already exists in the zoo!");
                return false;
            }
        }
        
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.getName()+ " has been added to the zoo.");
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animals in " + this.name + ":");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null) {
                System.out.println("Animal " + (i+1) + ": " + animals[i].getName());
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                System.out.println(animal.getName() + " has been removed from the zoo.");
                return true;
            }
        }
        System.out.println("Animal not found in the zoo.");
        return false;
   
    }

    public boolean isZooFull() {
        return animalCount >= NUMBER_OF_CAGES;
    }
    
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        }
        return z2;
    }
    
}
