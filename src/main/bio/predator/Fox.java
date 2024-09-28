package main.bio.predator;

import main.bio.Animal;
import main.bio.interfaces.Predator;

import static main.constants.ConfigConstants.*;

public class Fox extends Animal implements Predator {
    private static int count;

    public Fox() {
        count++;
        this.icons = FOX_ICON;
        this.name = FOX_NAME + count;
        this.weight = FOX_WEIGHT;
        this.speed = FOX_SPEED;
        this.satiety = FOX_SATIETY;
        this.hungar = 0;
        this.probability = FOX_PROBABILITY;
        this.fileImage = FOX_FILE1;
        this.dayWithoutEat = 0;
    }

}
