package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.utils.InvalidAgeException;

public abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic(){super();}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
    super(family, name, age, isMammal);
    this.habitat = habitat;
}


    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
    
    public abstract void swim();

    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass().getSuperclass() != obj.getClass().getSuperclass()) return false;
    
    Aquatic aquatic = (Aquatic) obj;
    return this.getName().equals(aquatic.getName()) 
           && this.getAge() == aquatic.getAge() 
           && this.habitat.equals(aquatic.habitat);
}

}


