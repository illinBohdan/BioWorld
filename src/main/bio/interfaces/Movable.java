package main.bio.interfaces;

import main.bio.Animal;
import main.island.Island;

public interface Movable {
   default void move(Animal animal,Island island, int oldX, int oldY, int newX, int newY) {
        island.getLocation()[oldX][oldY].removeAnimals(animal);
        island.getLocation()[newX][newY].addAnimals(animal);
    }
}
