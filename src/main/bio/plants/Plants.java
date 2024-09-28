package main.bio.plants;
import main.bio.interfaces.EatingPlants;

import static main.constants.ConfigConstants.*;

public class Plants implements EatingPlants {
    private String name;
    public int weight;
    private String icons;
    public String fileImage;
    private static int count;

    public Plants() {
        count++;
        this.icons = PLANTS_ICON;
        this.name = PLANTS_NAME + count;
        this.fileImage = PLANTS_FILE;
        this.weight = PLANTS_WEIGHT;
    }

    public String getName() {
        return name;
    }

    public String getIcons() {
        return icons;
    }
}
