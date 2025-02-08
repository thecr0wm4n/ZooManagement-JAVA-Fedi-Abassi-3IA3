public class Zoo {
    Animal[] animals;
    String name;
    public static final int NUMBER_OF_CAGES = 25;
    String city;
    private int animalCount = 0;

    Zoo() {
        this.animals = new Animal[NUMBER_OF_CAGES];
    }

    Zoo(String name, int nbrCages, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NUMBER_OF_CAGES]; 
    }
    
    public void displayZoo() {
        System.out.println("Zoo name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of cages: " + NUMBER_OF_CAGES);
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < NUMBER_OF_CAGES; i++) {
            if (this.animals[i] != null) {
                System.out.println(this.animals[i].name);
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + NUMBER_OF_CAGES + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= NUMBER_OF_CAGES) {
            System.out.println("Zoo is full! Cannot add more animals.");
            return false;
        }
        
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                System.out.println("This animal already exists in the zoo!");
                return false;
            }
        }
        
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(animal.name + " has been added to the zoo.");
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animals in " + this.name + ":");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null) {
                System.out.println("Animal " + (i+1) + ": " + animals[i].name);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                System.out.println(animal.name + " has been removed from the zoo.");
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
