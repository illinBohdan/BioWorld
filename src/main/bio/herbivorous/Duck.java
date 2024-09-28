package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Duck extends Animal implements Herbivor {
    public double satiety;
    private static int count;
    public Duck() {
        count++;
        this.icons = DUCK_ICON;
        this.name = DUCK_NAME + count;
        weight = DUCK_WEIGHT;
        speed = DUCK_SPEED;
        satiety = DUCK_SATIETY;
        this.hungar = 0;
        this.probability = DUCK_PROBABILITY;
        this.fileImage = DUCK_FILE;
        this.dayWithoutEat = 0;
    }
}
