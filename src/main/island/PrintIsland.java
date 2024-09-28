package main.island;

import main.bio.Animal;
import main.bio.plants.Plants;



public class PrintIsland {
    public void printIsland(Island island) {
        for (int i = 0; i < island.getLocation().length; i++) {
            for (int j = 0; j < island.getLocation()[i].length; j++) {
                System.out.print("{");
                for (Animal a : island.getLocation()[i][j].getAnimalsList()) {
                    System.out.print(/*"Location (" + i + ", " + j + "):" + */a.getIcons()/* + "" + a.getName()*/);
                }
                for (Plants plant : island.getLocation()[i][j].getPlantsList()) {
                    System.out.print(/*"Location (" + i + ", " + j + "):" + */plant.getIcons()/*+ "" + plant.getName()*/);
                }
                System.out.print("}");
            }
            System.out.println();
        }
        System.out.println("__________________________");
    }
}
