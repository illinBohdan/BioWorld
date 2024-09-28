package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Mouse extends Animal implements Herbivor {
    public double weight;
    public double satiety;
    private static int count;
    public Mouse() {
        count++;
        this.icons = MOUSE_ICON;
        this.name = MOUSE_NAME + count;
        this.weight = MOUSE_WEIGHT;
        speed = MOUSE_SPEED;
        satiety = MOUSE_SATIETY;
        this.hungar = 0;
        probability = MOUSE_PROBABILITY;
        this.fileImage = MOUSE_FILE;
        this.dayWithoutEat = 0;
    }
}
