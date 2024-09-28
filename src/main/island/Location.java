package main.island;

import main.bio.Animal;
import main.bio.plants.Plants;


import java.util.*;

public class Location  {
    private List<Animal> animalsList = new ArrayList<>();
    private List<Plants> plantsList = new ArrayList<>();

    public void addAnimals( Animal animal){
        animalsList.add(animal);

    }
    public void addPlants(Plants plant){
        plantsList.add(plant);
    }
    public void removeAnimals(Animal animal){
        animalsList.remove(animal);
    }
    public void removePlants(Plants plant){
        plantsList.remove(plant);
    }

    public List<Animal> getAnimalsList() {
        return animalsList;
    }

    public List<Plants> getPlantsList() {
        return plantsList;
    }
}
