package main.island;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandom {

    public boolean probabilityRandom(int probability) {
        int randomValue = ThreadLocalRandom.current().nextInt(101);
        return randomValue < probability;
    }

}
