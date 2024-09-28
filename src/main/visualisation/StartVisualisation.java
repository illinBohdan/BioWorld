package main.visualisation;
import main.island.Island;
import javax.swing.*;
import java.awt.*;

public class StartVisualisation {
    private static JFrame frame;
    public static void visualisation(Island island) {

        if (frame == null){
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 800);
            frame.setVisible(true);
        }

        IslandVisualizer visualizer = new IslandVisualizer(island);
        visualizer.setBackground(Color.green);
        frame.getContentPane().removeAll(); // Видаляємо старий вміст
        frame.add(visualizer);
        frame.revalidate(); // Оновлюємо компоненти
        frame.repaint(); // Перемальовуємо вікно
    }
}
