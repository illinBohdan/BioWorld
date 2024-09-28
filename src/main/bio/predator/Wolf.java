package main.bio.predator;

import main.bio.Animal;
import main.bio.interfaces.Predator;

import java.util.HashMap;

import static main.constants.ConfigConstants.*;

public class Wolf extends Animal implements Predator {
    private static int count;



    public Wolf() {
        count++;
        this.icons = WOLF_ICON;
        this.name = WOLF_NAME + count;
        this.weight = WOLF_WEIGHT;
        this.speed = WOLF_SPEED;
        this.satiety = WOLF_SATIETY;
        this.hungar = 0;
        this.probability = WOLF_PROBABILITY;
        this.fileImage = WOLF_FILE;
        this.dayWithoutEat = 0;

    }

    /*public int setHungar(int eat) {
        int amAm = this.hungar + eat;
        if (amAm > this.satiety){
            return this.satiety;
        }else {
            return amAm;
        }
    }*/


}
