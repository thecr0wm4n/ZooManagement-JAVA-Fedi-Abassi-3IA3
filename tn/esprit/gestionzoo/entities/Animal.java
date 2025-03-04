package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.utils.InvalidAgeException;

public class Animal {

    private String family;
	private String name;
    private int age;
	private boolean isMammal;
    
public Animal() {
    
}

   public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }
    
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /*public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }*/
    public void setAge(int age) throws InvalidAgeException {
    if (age < 0) {
        throw new InvalidAgeException("Age cannot be negative");
    }
    this.age = age;
}

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


    @Override
public String toString() {
    return "Animal{family='" + family + "', name='" + name + "', age=" + age + ", isMammal=" + isMammal + "}";
}


}
