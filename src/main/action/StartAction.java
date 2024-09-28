package main.action;

import main.action.settlement.Settlement;
import main.visualisation.StartVisualisation;
import main.statistic.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static main.constants.ConfigConstants.*;

public class StartAction {
    public static int count = 1;
    private  ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(8);
    Settlement settlement = new Settlement();
    MovingAnimals movingAnimals = new MovingAnimals();
    PredatorEatHerbivor predatorEat = new PredatorEatHerbivor();
    HerbivorousEatingPlants herbEat = new HerbivorousEatingPlants();
    ReproduceAnimal reproduceAnimal = new ReproduceAnimal();
    StartVisualisation startVisualisation = new StartVisualisation();
    DeathViaHunger deathViaHunger = new DeathViaHunger();


    public void startMovingAnimals() {
         settlement.populateIslandWithAnimals();

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Результат РУХУ: ДЕНЬ - " + count);
            movingAnimals.moveAnimals(settlement.island);
            startVisualisation.visualisation(settlement.island);
            settlement.island.print.printIsland(settlement.island);
            checkShedulerAndStop();
        }, 0, 5, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Результат ПОЇЛИ ДЕНЬ - " + count);
            predatorEat.eatHerbivorous(settlement.island);
            herbEat.herbivorousEating(settlement.island);
            startVisualisation.visualisation(settlement.island);
            settlement.island.print.printIsland(settlement.island);
            checkShedulerAndStop();
        }, 4, 5, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Результат Розмноження ДЕНЬ - " + count);
            reproduceAnimal.reproduce(settlement.island);
            startVisualisation.visualisation(settlement.island);
            settlement.island.print.printIsland(settlement.island);
            checkShedulerAndStop();
        }, 8, 5, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Результат Голодна смерть ДЕНЬ - " + count);
            deathViaHunger.hungerDeath(settlement.island);
            startVisualisation.visualisation(settlement.island);
            settlement.island.print.printIsland(settlement.island);
            checkShedulerAndStop();
        }, 12, 5, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(()-> {
            growPlants();
            count++;
        },12,5, TimeUnit.SECONDS);

    }
    public void checkShedulerAndStop() {
        if (count == FINISH_SIMULATION+1 || Statistic.getAllLiveAnimal().isEmpty()){
            scheduler.shutdown();
            Statistic.printSetWithAnimal();
            System.exit(0);
        }
    }
    public void growPlants(){
        if (count % REGROW_PLANTS == 0){
            settlement.firstGrowPlants();
            settlement.populateIslandPlants(settlement.plants);
        }
    }


     /*scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Результат РУХУ: ДЕНЬ - " + count);
            movingAnimals.moveAnimals(island);
            startVisualisation.visualisation(island);
            island.print.printIsland(island);
            System.out.println("Результат ПОЇЛИ ДЕНЬ - "+ count);
            predatorEat.eatHerbivorous(island);
            herbEat.herbivorousEating(island);
           startVisualisation.visualisation(island);
           island.print.printIsland(island);
            System.out.println("Результат Розмноження ДЕНЬ - "+ count);
            reproduceAnimal.reproduce(island);
            startVisualisation.visualisation(island);
            island.print.printIsland(island);
            System.out.println("Голодна смерть ДЕНЬ - "+ count);
            deathViaHunger.hungerDeath(island);
            startVisualisation.visualisation(island);
            island.print.printIsland(island);
            count++;

            *//*Statistic.printSetWithAnimal();
            System.out.println("!!!!!!!!!!!!!!!!!EATING!!!!!!!!!!!!!!!!!!");
            compareSet.calculateAnimal(Statistic.getPredatorEat());
            System.out.println("!!!!!!!!!!!!!!!!!LIVE!!!!!!!!!!!!!!!!!!");
            compareSet.calculateAnimal(Statistic.getAllLiveAnimal());
            System.out.println("!!!!!!!!!!!!!!BORN!!!!!!!!!!!!!!!!!!!!!!!");
            compareSet.calculateAnimal(Statistic.getNewBornAnimal());
            System.out.println("!!!!!!!!!!!!!!HUNGER!!!!!!!!!!!!!!!!!!!!!!!");
            compareSet.calculateAnimal(Statistic.getDeathHunger());*//*


        },0, 2, TimeUnit.SECONDS);*/


}
