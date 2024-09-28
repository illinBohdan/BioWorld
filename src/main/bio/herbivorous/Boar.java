package main.bio.herbivorous;

import main.bio.Animal;
import main.bio.interfaces.Herbivor;
import main.bio.interfaces.Predator;

import static main.constants.ConfigConstants.*;

public class Boar extends Animal implements Herbivor {
    private static int count;
    public Boar() {
        count++;
        this.icons = BOAR_ICON;
        this.name = BOAR_NAME + count;
        this.weight = BOAR_WEIGHT;
        this.speed = BOAR_SPEED;
        this.satiety = BOAR_SATIETY;
        this.hungar = 0;
        this.probability = BOAR_PROBABILITY;
        this.fileImage = BOAR_FILE;
        this.dayWithoutEat = 0;
    }
}
