package main.action;

import main.bio.Animal;
import main.island.*;

import java.util.*;

import static main.constants.ConfigConstants.*;


public class PredatorEatHerbivor {
    public void eatHerbivorous(Island island) {
        Animal animal = new Animal();
        for (int i = 0; i < ISLAND_WEIGHT; i++) {
            for (int j = 0; j < ISLAND_HEIGHT; j++) {
                Location location = island.getLocations(i, j);
                List<Animal> animals = new ArrayList<>(location.getAnimalsList());

                      animal.isEatable(animals,island,i,j);

            }
        }
    }
}
