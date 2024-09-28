package main.action.settlement;

import main.bio.*;
import main.bio.predator.*;
import main.bio.plants.*;
import main.bio.herbivorous.*;
import main.island.*;
import main.statistic.Statistic;

import java.util.*;
import static main.constants.ConfigConstants.*;

public  class Settlement {
    public Island island = new Island();
    List<Animal> animals = new ArrayList<>();
    public List<Plants> plants = new ArrayList<>();
    public void populateIslandWithAnimals() {
        for (int i = 0; i < FIRST_BORN_ANIMAL; i++) {
            animals.add(new Wolf());
            animals.add(new Boa());
            animals.add(new Bear());
            animals.add(new Eagle());
            animals.add(new Boar());
            animals.add(new Buffalo());
            animals.add(new Caterpillar());
            animals.add(new Deer());
            animals.add(new Duck());
            animals.add(new Goat());
            animals.add(new Horse());
            animals.add(new Mouse());
            animals.add(new Rabbit());
            animals.add(new Sheep());
            animals.add(new Fox());
        }
        firstGrowPlants();

        populateIslandAnimals(animals);
        populateIslandPlants(plants);
        island.print.printIsland(island);
    }

    public void firstGrowPlants(){
        for (int j = 0; j < FIRST_BORN_PLANTS; j++) {
            plants.add(new Plants());
        }
    }

    public void populateIslandAnimals(List<Animal> animals) {
        Random random = new Random();
        for (Animal animal : animals) {
            int x = random.nextInt(ISLAND_WEIGHT);
            int y = random.nextInt(ISLAND_HEIGHT);
            island.getLocation()[x][y].addAnimals(animal);
            Statistic.addAnimalToSetAllLiveAnimal(animal.getName());
        }

    }
    public void populateIslandPlants(List<Plants> plants) {
        Random random = new Random();
        for (Plants plant : plants) {
            int x = random.nextInt(ISLAND_WEIGHT);
            int y = random.nextInt(ISLAND_HEIGHT);
            island.getLocation()[x][y].addPlants(plant);
        }
    }
}




