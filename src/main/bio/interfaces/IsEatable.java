package main.bio.interfaces;

import main.bio.Animal;
import main.island.GenerateRandom;
import main.island.Island;
import main.statistic.Statistic;
import static main.constants.ConfigConstants.*;

import java.util.*;


public interface IsEatable {
    GenerateRandom random = new GenerateRandom();
    default void isEatable(List<Animal> animals, Island island, int oldX, int oldY) {
        boolean animalEaten = false;
        for (Animal dominus : animals) {
            if (dominus.hungar < dominus.satiety) {
                for (Animal victim : animals) {
                    for (String key : dominus.probability.keySet()) {
                        // System.out.println("Key: " + key + ", Value: " + dominus.probability.get(key));
                        if (victim.getClass().getName().contains(key)) {
                            if (random.probabilityRandom(dominus.probability.get(key))) {
                                dominus.hungar = dominus.setHungar(victim.weight);
                               // System.out.println(dominus.getName() + " Зїв " + victim.getName() + " " + dominus.hungar + " - " + dominus.satiety);

                                Statistic.addAnimalToSetPredatorEat(victim.getName());
                                island.getLocation()[oldX][oldY].removeAnimals(victim);
                                dominus.dayWithoutEat = 0;//обнуляємо дні без їжі
                                animalEaten = true;
                                break;
                            } else {

                            //    System.out.println(victim.getName() + " Втік від " + dominus.getName() + " " + dominus.probability.get(key) + " %");
                            }
                        }
                        if (animalEaten) break;
                    }
                }
                if (animalEaten) break;
            }
            if (animalEaten) {
                isEatable(animals, island, oldX, oldY);
            }else {
                dominus.setDayWithoutEat(1);// добавляємо +1 день беж їжі
                //dominus.hungar = dominus.hungar - (double) (PERCENT_HUNGER / 100)*dominus.satiety;// збільшуємо голод тварини на певний процент
            }

        }
    }
}
