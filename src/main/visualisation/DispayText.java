package main.visualisation;

import main.action.StartAction;
import main.statistic.Statistic;

import javax.swing.*;



public class DispayText {
    public void displayAnimals(JLabel displayLabel) {

        String text = "<html>День - " + StartAction.count + "<br>Зїдені тварини - " + Statistic.getPredatorEat().size() +
                "<br>Tварини що вмерли від голоду - " +  Statistic.getDeathHunger().size() +
                "<br>Усі що живі тварини - " + Statistic.getAllLiveAnimal().size() +
                "<br>Новонароджені тварини - " + Statistic.getNewBornAnimal().size() +
                "<br>Зїденні рослини - " + Statistic.getEatenPlants().size() + "</html>";
            displayLabel.setText(text);


    }

    private void displayPlants(JLabel displayLabel) {

        displayLabel.setText("");
    }



}
