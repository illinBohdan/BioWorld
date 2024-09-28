package main.bio.interfaces;

import main.bio.Animal;
import main.bio.plants.Plants;
import main.island.Island;
import main.statistic.Statistic;

import java.util.ArrayList;
import java.util.List;

import static main.constants.ConfigConstants.PERCENT_HUNGER;

public interface EatingPlants {
    default void animalEatingPlants(List<Animal> animals, List<Plants> plants, Island island, int oldX, int oldY) {
        List<Plants> eatenPlants = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal instanceof Herbivor) {
                for (Plants plant : plants) {
                    if (!eatenPlants.contains(plant)) {
                        if (animal.hungar < animal.satiety) {
                            animal.hungar = animal.setHungar(plant.weight);
                            //System.out.println(animal.getName() + " з'їв " + plant.getName() + " " + animal.hungar + " - " + animal.satiety);
                            Statistic.addEatenPlants(plant.getName());
                            island.getLocation()[oldX][oldY].removePlants(plant);
                            eatenPlants.add(plant); // Додаємо рослину до списку з'їдених
                            animal.dayWithoutEat = 0;
                        } else {
                            animal.setDayWithoutEat(1);//добаляємо день без їжі
                           // animal.hungar = animal.hungar - ((double) PERCENT_HUNGER / 100) * (double) animal.satiety; // збільшуємо голод тварини на певний процент
                            //System.out.println("!!!!!" + animal.getName() + " - " + animal.hungar + " - " + animal.satiety);
                        }
                        if (animal.hungar == animal.satiety) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
