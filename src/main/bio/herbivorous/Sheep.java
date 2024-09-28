package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Sheep extends Animal implements Herbivor {
    private static int count;
    public Sheep() {
        count++;
        this.icons = SHEEP_ICON;
        this.name = SHEEP_NAME + count;
        weight = SHEEP_WEIGHT;
        speed = SHEEP_SPEED;
        satiety = SHEEP_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = SHEEP_FILE;
        this.dayWithoutEat = 0;
    }
}
