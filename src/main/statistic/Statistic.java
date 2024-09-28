package main.statistic;

import main.bio.Animal;
import main.bio.herbivorous.Rabbit;
import main.bio.predator.Wolf;

import java.util.HashSet;
import java.util.Set;

public class Statistic {
    private static Set<String> allLiveAnimal = new HashSet<>();
    private static Set<String> predatorEat = new HashSet<>();
    private static Set<String> newBornAnimal = new HashSet<>();
    private static Set<String> deathHunger = new HashSet<>();
    private static Set<String> eatenPlants = new HashSet<>();

    public static void addAnimalToSetPredatorEat(String animal){
        predatorEat.add(animal);
        allLiveAnimal.remove(animal);
    }



    public static void addAnimalToSetAllLiveAnimal(String animal){
        allLiveAnimal.add(animal);
    }

    public static void addAnimalToNewBornAnimal(String animal){
        newBornAnimal.add(animal);
    }

    public static void addAnimalToDeathByHunger(String animal){
        deathHunger.add(animal);
        allLiveAnimal.remove(animal);
    }
    public static void addEatenPlants(String plant){
       eatenPlants.add(plant);
    }

    public static void printSetWithAnimal(){
        System.out.println("Зїдені тварини - " + predatorEat.size());
        System.out.println("Зїдені тварини " + predatorEat);
        System.out.println("Tварини що вмерли від голоду - " + deathHunger.size());
        System.out.println("Tварини що вмерли від голоду " + deathHunger);
        System.out.println("Усі що живі тварини - " + allLiveAnimal.size());
        System.out.println("Усі що живі тварини " + allLiveAnimal);
        System.out.println( "Новонароджені тварини - " + newBornAnimal.size());
        System.out.println( "Новонароджені тварини " + newBornAnimal);
    }

    public static Set<String> getAllLiveAnimal() {
        return allLiveAnimal;
    }

    public static Set<String> getPredatorEat() {
        return predatorEat;
    }

    public static Set<String> getNewBornAnimal() {
        return newBornAnimal;
    }

    public static Set<String> getDeathHunger() {
        return deathHunger;
    }

    public static Set<String> getEatenPlants() {
        return eatenPlants;
    }
}
