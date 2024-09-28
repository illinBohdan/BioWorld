package main.action;

import main.bio.Animal;
import main.island.Island;
import main.island.Location;

import java.util.ArrayList;
import java.util.List;

import static main.constants.ConfigConstants.ISLAND_HEIGHT;
import static main.constants.ConfigConstants.ISLAND_WEIGHT;

public class DeathViaHunger {
    public void hungerDeath(Island island) {
        Animal animal = new Animal();
        for (int i = 0; i < ISLAND_WEIGHT; i++) {
            for (int j = 0; j < ISLAND_HEIGHT; j++) {
                Location location = island.getLocations(i, j);
                List<Animal> animals = new ArrayList<>(location.getAnimalsList());

                animal.deathByHunger(animals,island,i,j);

            }
        }
    }
}
