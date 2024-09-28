package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;

import static main.constants.ConfigConstants.*;

public class Deer extends Animal implements Herbivor {
    public static int count;


    public Deer() {
        count++;
        this.icons = DEER_ICON;
        this.name = DEER_NAME + count;
       weight = DEER_WEIGHT;
       speed = DEER_SPEED;
       satiety = DEER_SATIETY;
        this.hungar = 0;
        this.probability = FOR_ALL_PROBABILITY;
        this.fileImage = DEER_FILE;
        this.dayWithoutEat = 0;
    }
}
