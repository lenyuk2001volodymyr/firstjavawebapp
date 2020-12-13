package Main;

import Character.Can_Move;
import Character.Hero;
import Game.Game;
import Person_Char.Characteristic;
import Person_Char.Place;
import Person_Char.Weapon;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("ok");

        Place heroPlace1 = new Place(0,0);
        Place heroPlace2 = new Place(1,1);
        Place heroPlace3 = new Place(1,1);
        place_Check(heroPlace1, heroPlace2, heroPlace3);

        LinkedList <Can_Move> can_move1 = new LinkedList<>();
        LinkedList <Can_Move> can_move2 = new LinkedList<>();

        Weapon weapon1 = new Weapon("Weapon 1", 35, 20, 20, 15);
        Weapon weapon2 = new Weapon("Weapon 2", 50, 15, 30, 10);
        Weapon weapon3 = new Weapon("Weapon 2", 50, 15, 30, 10);
        weapon_Check(weapon1, weapon2, weapon3);

        Characteristic characteristic1 = new Characteristic(25, 25,25,25);
        Characteristic characteristic2 = new Characteristic(35, 15,35,25);
        Characteristic characteristic3 = new Characteristic(35, 15,35,25);
        characteristic_Check(characteristic1, characteristic2, characteristic3);

        Hero hero1 = new Hero(weapon1, "Hero 1", 1, 0, 2, characteristic1);
        Hero hero2 = new Hero(weapon2, "Hero 2", 1, 0, 2, characteristic2);
        Hero hero3 = new Hero(weapon2, "Hero 2", 1, 0, 2, characteristic2);
        hero_Check(hero1, hero2, hero3);

        Game game = new Game();

        game.getHeroes().add(hero1);
        game.getHeroes().add(hero2);
        game.getHeroes().add(hero3);
    }

    public static void hero_Check(Hero hero1, Hero hero2, Hero hero3){
        System.out.println("Hero check : ");
        System.out.println("Hero 1 : " + hero1);
        System.out.println(hero1.hashCode());
        System.out.println("Hero 2 : " + hero2);
        System.out.println(hero2.hashCode());
        System.out.println("Hero 3 : " + hero3);
        System.out.println(hero3.hashCode());
        System.out.println("Hero 1 == Hero 2 : " + hero1.equals(hero2));
        System.out.println("Hero 2 == Hero 3 : " + hero2.equals(hero3));

    }

    public static void characteristic_Check(Characteristic characteristic1, Characteristic characteristic2, Characteristic characteristic3){
        System.out.println("Characteristic check : ");
        System.out.println("Characteristic 1 : " + characteristic1);
        System.out.println(characteristic1.hashCode());
        System.out.println("Characteristic 2 : " + characteristic2);
        System.out.println(characteristic2.hashCode());
        System.out.println("Characteristic 3 : " + characteristic3);
        System.out.println(characteristic3.hashCode());
        System.out.println("Characteristic 1 == Characteristic 2 : " + characteristic1.equals(characteristic2));
        System.out.println("Characteristic 2 == Characteristic 3 : " + characteristic2.equals(characteristic3));
    }

    public static void weapon_Check(Weapon weapon1, Weapon weapon2, Weapon weapon3){
        System.out.println("Weapon check : ");
        System.out.println("Weapon 1 : " + weapon1);
        System.out.println(weapon1.hashCode());
        System.out.println("Weapon 2 : " + weapon2);
        System.out.println(weapon2.hashCode());
        System.out.println("Weapon 3 : " + weapon3);
        System.out.println(weapon3.hashCode());
        System.out.println("Weapon 1 == Weapon 2 : " + weapon1.equals(weapon2));
        System.out.println("Weapon 2 == Weapon 3 : " + weapon2.equals(weapon3));
    }

    public static void place_Check(Place heroPlace1, Place heroPlace2, Place heroPlace3){
        System.out.println("Place check : ");
        System.out.println("Place 1 : " + heroPlace1);
        System.out.println(heroPlace1.hashCode());
        System.out.println("Place 2 : " + heroPlace2);
        System.out.println(heroPlace2.hashCode());
        System.out.println("Place 3 : " + heroPlace3);
        System.out.println(heroPlace3.hashCode());
        System.out.println("Place 1 == Place 2 : " + heroPlace1.equals(heroPlace2));
        System.out.println("Place 2 == Place 3 : " + heroPlace2.equals(heroPlace3));
    }
}
