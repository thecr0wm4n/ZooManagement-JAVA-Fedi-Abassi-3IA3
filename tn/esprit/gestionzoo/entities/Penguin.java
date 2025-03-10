package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.utils.InvalidAgeException;

public class Penguin extends Aquatic {
    protected float swimmingDepth;
    
    
    public Penguin() {
        super();
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    
   public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
    super(family, name, age, isMammal, habitat);
    this.swimmingDepth = swimmingDepth;
}


    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }

    @Override
public void swim() {
    System.out.println("This penguin is swimming.");
}

}