package main.bio.interfaces;

import main.bio.Animal;
import main.island.Island;
import main.statistic.Statistic;
import static main.constants.ConfigConstants.*;
import java.util.List;

public interface DeathByHunger {

    default void deathByHunger(List<Animal> animals, Island island, int oldX, int oldY) {


        for (Animal animal : animals) {
            if (animal.dayWithoutEat > 0 && animal.dayWithoutEat % DAYS_WITHOUT_EAT == 0 ) {
                Statistic.addAnimalToDeathByHunger(animal.getName());
                System.out.println(animal.getName() + " Помер від голоду, був без їжі " + animal.dayWithoutEat);
                island.getLocation()[oldX][oldY].removeAnimals(animal);
            }
        }
    }
}



