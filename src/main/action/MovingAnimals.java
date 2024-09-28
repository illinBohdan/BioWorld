package main.action;
import main.bio.*;
import main.island.*;
import java.util.*;
import static main.constants.ConfigConstants.*;


public class MovingAnimals {
    Random random = new Random();

    public void moveAnimals(Island island) {

        for (int i = 0; i < ISLAND_WEIGHT; i++) {
            for (int j = 0; j < ISLAND_HEIGHT; j++) {
                Location location = island.getLocations(i, j);
                List<Animal> animals = new ArrayList<>(location.getAnimalsList());
                for (Animal animal : animals) {
                    int maxStep = animal.speed;
                    int newX = Math.min(Math.max(i + random.nextInt(2 * maxStep + 1) - maxStep, 0), ISLAND_WEIGHT-1);
                    int newY = Math.min(Math.max(j + random.nextInt(2 * maxStep + 1) - maxStep, 0), ISLAND_HEIGHT-1);

                    if ((animal.hungar - ((double) PERCENT_HUNGER / 100) * (double) animal.satiety) < 0)
                    {
                        animal.hungar = 0;
                    }else
                    {
                        animal.hungar = animal.hungar - ((double) PERCENT_HUNGER / 100) * (double) animal.satiety; // збільшуємо голод тварини на певний процент
                    }
                    animal.move(animal, island, i, j, newX, newY);
                }
            }
        }
    }
}
