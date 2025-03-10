package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.utils.InvalidAgeException;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;
    
    public Dolphin() {
        super();
    }
    
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) throws InvalidAgeException {
    super(family, name, age, isMammal, habitat);
    this.swimmingSpeed = swimmingSpeed;
}

    
    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
    @Override
    public void swim()
    {
        System.out.println("This Dolphin is swimming");
    }
}

