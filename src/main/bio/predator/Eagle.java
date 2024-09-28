package main.bio.predator;

import main.bio.Animal;
import main.bio.interfaces.Predator;

import static main.constants.ConfigConstants.*;

public class Eagle extends Animal implements Predator {
    private static int count;

    public Eagle() {
        count++;
        this.icons = EAGLE_ICON;
        this.name = EAGLE_NAME + count;
        this.weight = EAGLE_WEIGHT;
        this.speed = EAGLE_SPEED;
        this.satiety = EAGLE_SATIETY;
        this.hungar = 0;
        this.probability = EAGLE_PROBABILITY;
        this.fileImage = EAGLE_FILE;
        this.dayWithoutEat = 0;
    }
}
