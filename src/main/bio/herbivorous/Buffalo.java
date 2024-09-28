package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Buffalo extends Animal implements Herbivor {
    private static int count;
    public Buffalo() {
        count++;
        this.icons = BUFFALO_ICON;
        this.name = BUFFALO_NAME + count;
        this.weight = BUFFALO_WEIGHT;
        this.speed = BUFFALO_SPEED;
        this.satiety = BUFFALO_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = BUFFALO_FILE;
        this.dayWithoutEat = 0;
    }
}
