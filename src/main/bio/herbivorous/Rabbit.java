package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Rabbit extends Animal implements Herbivor {
    public double satiety;
    private static int count;
    public Rabbit() {
        count++;
        this.icons = RABBIT_ICON;
        this.name = RABBIT_NAME + count;
        this.weight = RABBIT_WEIGHT;
        this.speed = RABBIT_SPEED;
        this.satiety = RABBIT_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = RABBIT_FILE;
        this.dayWithoutEat = 0;
    }
}
