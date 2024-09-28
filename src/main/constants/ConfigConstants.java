package main.constants;

import main.bio.Animal;
import main.bio.herbivorous.Rabbit;

import java.util.HashMap;

import static javax.swing.UIManager.put;

public class ConfigConstants {
 ///-------------ISLAND----------///
 public static final int FINISH_SIMULATION = 15;
 public static final int ISLAND_WEIGHT =10;
 public static final int ISLAND_HEIGHT = 2;

 ///-------------SETTLEMENT----------///
 public static final int FIRST_BORN_ANIMAL = 10;
 public static final int FIRST_BORN_PLANTS = 200;
 public static final int REGROW_PLANTS = 10;

 ///-------------REPRODUCTION----------///
 public static final int REPRODUCTION_PROBABILITY = 40;

 ///-------------HUNGER----------///
 public static final int PERCENT_HUNGER = 20;
 public static final int DAYS_WITHOUT_EAT = 10;

 ///--------------IMAGE----------///
 public static final String TREE_FILE = "src/resources/tree.png";
 public static final String BONES_FILE = "src/resources/bones.png";

 ///--------------WOLF----------///
 public static final String WOLF_ICON = "\uD83D\uDC3A";
 public static final String WOLF_NAME = "Вовк";
 public static final int WOLF_ONE_CELL = 30;
 public static final int WOLF_WEIGHT = 50;
 public static final int WOLF_SPEED = 3;
 public static final int WOLF_SATIETY = 8;
 public static final String WOLF_FILE = "src/resources/wolf.png";

 ///---------------BOA----------///
 public static final String BOA_ICON = "\uD83D\uDC0D";
 public static final String BOA_NAME = "Удав";
 public static final int BOA_ONE_CELL = 30;
 public static final int BOA_WEIGHT = 15;
 public static final int BOA_SPEED = 1;
 public static final int BOA_SATIETY = 3;
 public static final String BOA_FILE = "src/resources/boa.png";

 ///---------------FOX----------///
 public static final String FOX_ICON = "\uD83E\uDD8A";
 public static final String FOX_NAME = "Лисиця";
 public static final int FOX_ONE_CELL = 30;
 public static final int FOX_WEIGHT = 8;
 public static final int FOX_SPEED = 2;
 public static final int FOX_SATIETY = 2;

 public static final String FOX_FILE = "src/main/config/FOX.png";
 public static final String FOX_FILE1 = "src/resources/fox.png";

 ///---------------BEAR----------///
 public static final String BEAR_ICON = "\uD83D\uDC3B";
 public static final String BEAR_NAME = "Ведмідь";
 public static final int BEAR_ONE_CELL = 5;
 public static final int BEAR_WEIGHT = 500;
 public static final int BEAR_SPEED = 2;
 public static final int BEAR_SATIETY = 80;
 public static final String BEAR_FILE = "src/resources/bear.png";

 ///---------------EAGLE----------///
 public static final String EAGLE_ICON = "\uD83E\uDD85";
 public static final String EAGLE_NAME = "Орел";
 public static final int EAGLE_ONE_CELL = 20;
 public static final int EAGLE_WEIGHT = 6;
 public static final int EAGLE_SPEED = 3;
 public static final int EAGLE_SATIETY = 1;
 public static final String EAGLE_FILE = "src/resources/eagle.png";

 ///---------------HORSE----------///
 public static final String HORSE_ICON = "\uD83D\uDC0E";
 public static final String HORSE_NAME = "Кінь";
 public static final int HORSE_ONE_CELL = 20;
 public static final int HORSE_WEIGHT = 400;
 public static final int HORSE_SPEED = 4;
 public static final int HORSE_SATIETY = 60;
 public static final String HORSE_FILE = "src/resources/horse.png";

 ///---------------DEER----------///
 public static final String DEER_ICON = "\uD83E\uDD8C";
 public static final String DEER_NAME = "Олень";
 public static final int DEER_ONE_CELL = 20;
 public static final int DEER_WEIGHT = 300;
 public static final int DEER_SPEED = 4;
 public static final int DEER_SATIETY = 50;
 public static final String DEER_FILE = "src/resources/deer.png";

 ///---------------RABBIT----------///
 public static final String RABBIT_ICON = "\uD83D\uDC07";
 public static final String RABBIT_NAME = "Кролик";
 public static final int RABBIT_ONE_CELL = 150;
 public static final int RABBIT_WEIGHT = 2;
 public static final int RABBIT_SPEED = 2;
 public static final double RABBIT_SATIETY = 0.45;
 public static final String RABBIT_FILE = "src/resources/rabbit.png";

 ///---------------MOUSE----------///
 public static final String MOUSE_ICON = "\uD83D\uDC01";
 public static final String MOUSE_NAME = "Миша";
 public static final int MOUSE_ONE_CELL = 500;
 public static final double MOUSE_WEIGHT = 0.05;
 public static final int MOUSE_SPEED = 1;
 public static final double MOUSE_SATIETY = 0.01;
 public static final String MOUSE_FILE = "src/resources/mouse.png";

 ///---------------GOAT----------///
 public static final String GOAT_ICON = "\uD83D\uDC10";
 public static final String GOAT_NAME = "Коза";
 public static final int GOAT_ONE_CELL = 140;
 public static final int GOAT_WEIGHT = 60;
 public static final int GOAT_SPEED = 3;
 public static final int GOAT_SATIETY = 10;
 public static final String GOAT_FILE = "src/resources/goat.png";

 ///---------------SHEEP----------///
 public static final String SHEEP_ICON = "\uD83D\uDC11";
 public static final String SHEEP_NAME = "Вівця";
 public static final int SHEEP_ONE_CELL = 140;
 public static final int SHEEP_WEIGHT = 70;
 public static final int SHEEP_SPEED = 3;
 public static final int SHEEP_SATIETY = 15;
 public static final String SHEEP_FILE = "src/resources/sheep.png";


 ///---------------BOAR----------///
 public static final String BOAR_ICON = "\uD83D\uDC17";
 public static final String BOAR_NAME = "Кабан";
 public static final int BOAR_ONE_CELL = 50;
 public static final int BOAR_WEIGHT = 400;
 public static final int BOAR_SPEED = 2;
 public static final int BOAR_SATIETY = 50;
 public static final String BOAR_FILE = "src/resources/boar.png";

 ///---------------BUFFALO----------///
 public static final String BUFFALO_ICON = "\uD83D\uDC03";
 public static final String BUFFALO_NAME = "Буйвол";
 public static final int BUFFALO_ONE_CELL = 10;
 public static final int BUFFALO_WEIGHT = 700;
 public static final int BUFFALO_SPEED = 3;
 public static final int BUFFALO_SATIETY = 100;
 public static final String BUFFALO_FILE = "src/resources/buffalo.png";

 ///---------------DUCK----------///
 public static final String DUCK_ICON = "\uD83E\uDD86";
 public static final String DUCK_NAME = "Качка";
 public static final int DUCK_ONE_CELL = 200;
 public static final int DUCK_WEIGHT = 1;
 public static final int DUCK_SPEED = 4;
 public static final double DUCK_SATIETY = 0.15;
 public static final String DUCK_FILE = "src/resources/duck.png";

 ///---------------CATERPILLAR----------///
 public static final String CATERPILLAR_ICON = "\uD83D\uDC1B";
 public static final String CATERPILLAR_NAME = "Гусениця";
 public static final int CATERPILLAR_ONE_CELL = 1000;
 public static final double CATERPILLAR_WEIGHT = 0.01;
 public static final int CATERPILLAR_SPEED = 0;
 public static final int CATERPILLAR_SATIETY = 0;
 public static final String CATERPILLAR_FILE = "src/resources/caterpillar.png";

 ///---------------PLANTS----------///
 public static final String PLANTS_ICON = "\uD83C\uDF3F";
 public static final String PLANTS_NAME = "Рослина";
 public static final int PLANTS_ONE_CELL = 200;
 public static final int PLANTS_WEIGHT = 10;
 public static final String PLANTS_FILE = "src/resources/plant.png";

 ///---------------PROBABILITY_TO_EAT----------///
 public static final HashMap<String, Integer> WOLF_PROBABILITY = new HashMap<>();
 static {
  WOLF_PROBABILITY.put("Rabbit",60);
  WOLF_PROBABILITY.put("Horse",10);
  WOLF_PROBABILITY.put("Deer",15);
  WOLF_PROBABILITY.put("Mouse",80);
  WOLF_PROBABILITY.put("Goat",60);
  WOLF_PROBABILITY.put("Sheep",70);
  WOLF_PROBABILITY.put("Boar",15);
  WOLF_PROBABILITY.put("Buffalo",10);
  WOLF_PROBABILITY.put("Duck",40);
  }
 public static final HashMap<String, Integer> BEAR_PROBABILITY = new HashMap<>();
 static {
  BEAR_PROBABILITY.put("Boa",80);
  BEAR_PROBABILITY.put("Horse",40);
  BEAR_PROBABILITY.put("Deer",80);
  BEAR_PROBABILITY.put("Rabbit",80);
  BEAR_PROBABILITY.put("Mouse",90);
  BEAR_PROBABILITY.put("Goat",70);
  BEAR_PROBABILITY.put("Sheep",70);
  BEAR_PROBABILITY.put("Boar",50);
  BEAR_PROBABILITY.put("Buffalo",20);
  BEAR_PROBABILITY.put("Duck",10);
 }
 public static final HashMap<String, Integer> BOA_PROBABILITY = new HashMap<>();
 static {
  BOA_PROBABILITY.put("Fox",15);
  BOA_PROBABILITY.put("Rabbit",20);
  BOA_PROBABILITY.put("Mouse",40);
  BOA_PROBABILITY.put("Duck",10);
 }

 public static final HashMap<String, Integer> EAGLE_PROBABILITY = new HashMap<>();
 static {

  EAGLE_PROBABILITY.put("Rabbit",90);
  EAGLE_PROBABILITY.put("Mouse",90);
  EAGLE_PROBABILITY.put("Duck",80);
 }
 public static final HashMap<String, Integer> FOX_PROBABILITY = new HashMap<>();
 static {

  FOX_PROBABILITY.put("Rabbit",70);
  FOX_PROBABILITY.put("Mouse",90);
  FOX_PROBABILITY.put("Caterpillar",40);
  FOX_PROBABILITY.put("Duck",60);
 }
 public static final HashMap<String, Integer> BOAR_PROBABILITY = new HashMap<>();
 static {

  BOAR_PROBABILITY.put("Mouse",50);
  BOAR_PROBABILITY.put("Caterpillar",90);
  }
 public static final HashMap<String, Integer> MOUSE_PROBABILITY = new HashMap<>();
 static {
  MOUSE_PROBABILITY.put("Caterpillar",90);
 }
 public static final HashMap<String, Integer> DUCK_PROBABILITY = new HashMap<>();
 static {
  DUCK_PROBABILITY.put("Caterpillar",90);
 }
 public static final HashMap<String, Integer> FOR_ALL_PROBABILITY = new HashMap<>();
 static {
  FOR_ALL_PROBABILITY.put("   ",0);
 }
}
