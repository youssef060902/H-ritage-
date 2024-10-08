package tn.esprit.gestionzoo.entities;

public class Dauphin extends Aquatic {
    protected float swimmingSpeed;

    public Dauphin(String family ,String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family , name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }
}
