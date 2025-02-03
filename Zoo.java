public class Zoo {

    Animal[] animals;
    String name;
    int nbrCages;
    String city;
    private int animalCount = 0;

    Zoo(){
        this.animals = new Animal[25];
    }

    Zoo(String name, int nbrCages, String city) {
        this.name = name;
        this.nbrCages = nbrCages;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of cages: " + this.nbrCages);
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < this.nbrCages; i++) {
            if (this.animals[i] != null) {
                System.out.println(this.animals[i].name);
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }

    /*public boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }*/

    public boolean addAnimal(Animal animal) {
        
        if (animalCount >= nbrCages) {
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
                // Shift remaining animals to fill the gap
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
    
        
}
