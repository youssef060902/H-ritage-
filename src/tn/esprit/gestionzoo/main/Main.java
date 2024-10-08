package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dauphin;

public class Main {
    public static void main(String[] args) {

        Aquatic aquaticAnimal = new Aquatic("Fish", "Shark", 10, false, "Ocean");
        aquaticAnimal.swim();

        Dauphin dolphin = new Dauphin("Cetacea", "Dolphin", 5, true, "Ocean", 25.5f);
        dolphin.swim();

        Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Antarctic", 200f);
        penguin.swim();

    }
}
