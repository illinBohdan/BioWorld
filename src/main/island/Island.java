package main.island;
import static main.constants.ConfigConstants.*;

public class Island {
    private final Location[][] location;
    private final int width;
    private final int height;
    public PrintIsland print = new PrintIsland();

    public Island(){
        this.width = ISLAND_WEIGHT;
        this.height = ISLAND_HEIGHT;

        location = new Location[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                location[i][j] = new Location();
            }
        }
    }

    public Location getLocations(int x, int y){
        return location[x][y];
    }

    public Location[][] getLocation() {
        return location;
    }
}
