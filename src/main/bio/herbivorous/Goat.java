package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Goat extends Animal implements Herbivor {
    private static int count;
    public Goat() {
        count++;
        this.icons = GOAT_ICON;
        this.name = GOAT_NAME + count;
        this.weight = GOAT_WEIGHT;
        this.speed = GOAT_SPEED;
        this.satiety = GOAT_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = GOAT_FILE;
        this.dayWithoutEat = 0;
    }
}
