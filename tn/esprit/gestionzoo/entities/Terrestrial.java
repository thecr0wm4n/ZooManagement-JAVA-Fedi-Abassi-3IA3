package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.utils.InvalidAgeException;

public class Terrestrial extends Animal {

    private int nbrLegs;
    public Terrestrial(){super();}

    public Terrestrial(String family, String name, int age, boolean isMammal,String habitat, int nbrLegs) throws InvalidAgeException {
    super(family, name, age, isMammal);
    this.nbrLegs = nbrLegs;
}

    
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}
