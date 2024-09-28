package main.bio;

import main.bio.interfaces.*;

import java.util.HashMap;

public class Animal implements Movable, IsEatable, Reproduction, Cloneable, DeathByHunger {

    public String name;
    public int weight;
    public int speed;
    public int satiety;
    public double hungar;
    public String icons;
    public String fileImage;
    public int dayWithoutEat;

    public HashMap<String, Integer> probability;

    public String getName() {
        return name;
    }

    public String getIcons() {
        return icons;
    }



    public Animal clone1() {
        try {
            Animal cloned = (Animal) super.clone();
            cloned.name = cloned.getName() + "1";
            cloned.dayWithoutEat = 0;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public double setHungar(double eat) {
        double amAm = this.hungar + eat;

        if (amAm > this.satiety){
            return this.satiety;
        }else {
            return amAm;
        }
    }

    public void setDayWithoutEat(int dayWithoutEat) {
        this.dayWithoutEat = this.dayWithoutEat + dayWithoutEat;
    }
}
