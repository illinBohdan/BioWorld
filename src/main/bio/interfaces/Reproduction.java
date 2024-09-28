package main.bio.interfaces;

import main.bio.Animal;
import main.bio.predator.Wolf;
import main.island.GenerateRandom;
import main.island.Island;
import main.statistic.Statistic;

import static main.constants.ConfigConstants.*;

import java.util.*;
import java.util.*;

public interface Reproduction {
    GenerateRandom random = new GenerateRandom();
    Set<String> interactedPairs = new HashSet<>();

    default void reproduct(List<Animal> animals, Island island, int oldX, int oldY) {


        for (Animal man : animals) {
            for (Animal frau : animals) {
                if (man.getClass() == frau.getClass() && man.name != frau.name) {
                    String pair = man.getName() + "-" + frau.getName();
                    String reversePair = frau.getName() + "-" + man.getName();

                    if (!interactedPairs.contains(pair) && !interactedPairs.contains(reversePair)) {
                        interactedPairs.add(pair);
                        interactedPairs.add(reversePair);

                        if (random.probabilityRandom(REPRODUCTION_PROBABILITY)) {

                            Animal newBorn = frau.clone1();

                            island.getLocation()[oldX][oldY].addAnimals(newBorn);
                            Statistic.addAnimalToSetAllLiveAnimal(newBorn.getName());
                            Statistic.addAnimalToNewBornAnimal(newBorn.getName());
                          //  System.out.println(man.getName() + " створив потомство з " + frau.getName() + " з іменем " + newBorn.getName());
                            break;
                        } else {
                            //System.out.println(man.getName() + " нічого не вийшло з " + frau.getName());
                        }
                    }
                }
            }
        }
    }
}
