package main.visualisation;

import main.bio.Animal;
import main.bio.plants.Plants;
import main.island.Island;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static main.constants.ConfigConstants.*;




public class IslandVisualizer extends JPanel {
    private BufferedImage animalImage;
    private BufferedImage plantImage;
    private BufferedImage treeImage;
    private Island island;
    private JLabel infoLabel;
    SwitchBox switchBox = new SwitchBox();

    public IslandVisualizer(Island island) {
        this.island = island;
        this.setLayout(new BorderLayout());
        infoLabel = new JLabel("привіт");
        this.add(infoLabel, BorderLayout.SOUTH);
        switchBox.initializeComboBox(this, infoLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (island != null) {
            for (int i = 0; i < island.getLocation().length; i++) {
                int m = 0;
                for (int j = 0; j < island.getLocation()[i].length; j++) {
                    int x = j * 100;
                    int y = i * 100;
                    try {
                        treeImage = ImageIO.read(new File(TREE_FILE));
                    } catch (IOException e) {
                        System.err.println("Помилка завантаження зображень: " + e.getMessage());
                    }
                    g.drawImage(treeImage, x+10+m , y+20, this);
                    //List<Animal> animals = island.getLocation()[i][j].getAnimalsList();
                    List<Animal> animals = new ArrayList<>(island.getLocation()[i][j].getAnimalsList());
                    List<Plants> plants = new ArrayList<>(island.getLocation()[i][j].getPlantsList());
                    for (Animal animal : animals) {
                         try {
                            animalImage = ImageIO.read(new File(animal.fileImage));
                            } catch (IOException e) {
                            System.err.println("Помилка завантаження зображень: " + e.getMessage());
                        }
                        g.drawImage(animalImage, x + 80+m, y + 40, this);
                        m = m + 80;
                    }
                    for (Plants plant : plants) {
                        try {
                            plantImage = ImageIO.read(new File(plant.fileImage));
                        } catch (IOException e) {
                            System.err.println("Помилка завантаження зображень: " + e.getMessage());
                        }
                        g.drawImage(plantImage, x + 80+m, y + 40, this);
                    }
                }
            }
        }
    }
}
