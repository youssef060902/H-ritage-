package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbLegs;


    public Terrestrial() {
    }


    public Terrestrial(String family, String name, int age, boolean isMammal, int nbLegs) {
        super(family, name, age, isMammal);
        this.nbLegs = nbLegs;
    }


    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        if (nbLegs >= 0) {
            this.nbLegs = nbLegs;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbLegs;
    }
}
