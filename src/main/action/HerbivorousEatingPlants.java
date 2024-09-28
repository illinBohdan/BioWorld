package main.action;

import main.bio.Animal;
import main.bio.plants.Plants;
import main.island.Island;
import main.island.Location;

import java.util.ArrayList;
import java.util.List;

import static main.constants.ConfigConstants.ISLAND_HEIGHT;
import static main.constants.ConfigConstants.ISLAND_WEIGHT;

public class HerbivorousEatingPlants {
    public void herbivorousEating(Island island) {
        Plants plant =new Plants();
        for (int i = 0; i < ISLAND_WEIGHT; i++) {
            for (int j = 0; j < ISLAND_HEIGHT; j++) {
                Location location = island.getLocations(i, j);
                List<Animal> animals = new ArrayList<>(location.getAnimalsList());
                List<Plants> plants = new ArrayList<>(location.getPlantsList());

                    plant.animalEatingPlants(animals,plants,island,i,j);

            }
        }
    }
}
