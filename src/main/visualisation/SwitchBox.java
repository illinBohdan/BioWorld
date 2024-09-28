package main.visualisation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwitchBox {
    private JComboBox<String> comboBox;
    public void initializeComboBox(JPanel jPanel, JLabel infoLabel) {
        DispayText dispayText = new DispayText();
        String[] options = {"Show Statistic"};
        JButton openButton = new JButton("Open Statistic");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame comboBoxFrame = new JFrame("ComboBox Window");
                comboBoxFrame.setSize(300, 200);
                comboBoxFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                comboBoxFrame.setLayout(new BorderLayout());

                JComboBox<String> comboBox = new JComboBox<>(options);
                JLabel displayLabel = new JLabel("Select an option");

                comboBox.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String selectedOption = (String) comboBox.getSelectedItem();
                        switch (selectedOption) {
                            case "Show Statistic":
                                displayLabel.setText("Displaying animals...");
                                dispayText.displayAnimals(displayLabel);
                                break;

                        }
                    }
                });
                comboBoxFrame.add(comboBox, BorderLayout.NORTH);
                comboBoxFrame.add(displayLabel, BorderLayout.CENTER);
                comboBoxFrame.setVisible(true);
            }
        });
        jPanel.add(openButton, BorderLayout.NORTH);
    }
}