package main.bio.predator;

import main.bio.Animal;
import main.bio.interfaces.Predator;

import static main.constants.ConfigConstants.*;

public class Boa extends Animal implements Predator {
    private static int count;

    public Boa() {
        count++;
        this.icons = BOA_ICON;
        this.name = BOA_NAME + count;
        this.weight = BOA_WEIGHT;
        this.speed = BOA_SPEED;
        this.satiety = BOA_SATIETY;
        this.hungar = 0;
        this.probability = BOA_PROBABILITY;
        this.fileImage = BOA_FILE;
        this.dayWithoutEat = 0;
    }
}
