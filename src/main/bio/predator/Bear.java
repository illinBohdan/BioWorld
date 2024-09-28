package main.bio.predator;

import main.bio.Animal;
import main.bio.interfaces.Predator;

import static main.constants.ConfigConstants.*;

public class Bear extends Animal implements Predator {
    private static int count;

    public Bear() {
        count++;
        this.icons = BEAR_ICON;
        this.name = BEAR_NAME + count;
        this.weight = BEAR_WEIGHT;
        this.speed = BEAR_SPEED;
        this.satiety = BEAR_SATIETY;
        this.hungar = 0;
        this.probability = BEAR_PROBABILITY;
        this.fileImage = BEAR_FILE;
        this.dayWithoutEat = 0;
    }
}
