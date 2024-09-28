package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Horse extends Animal implements Herbivor {
    private static int count;

    public Horse() {
        count++;
        this.icons = HORSE_ICON;
        this.name = HORSE_NAME + count;
        this.weight = HORSE_WEIGHT;
        this.speed = HORSE_SPEED;
        this.satiety = HORSE_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = HORSE_FILE;
        this.dayWithoutEat = 0;
    }
}
