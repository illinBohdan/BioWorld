package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Caterpillar extends Animal implements Herbivor {
    public double weight;
    private static int count;
    public Caterpillar() {
        count++;
        this.icons = CATERPILLAR_ICON;
        this.name = CATERPILLAR_NAME + count;
        weight = CATERPILLAR_WEIGHT;
        speed = CATERPILLAR_SPEED;
        satiety = CATERPILLAR_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = CATERPILLAR_FILE;
        this.dayWithoutEat = 0;
    }
}
