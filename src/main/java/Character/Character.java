package Character;

import Person_Char.Place;

import java.util.LinkedList;
import java.util.Objects;

public class Character {

    /**
     * Опис змінних
     */

    private Place current_location;
    private String cname=new String();
    private int health;
    private LinkedList <Can_Move> move;

    /**
     * Конструктори з параметроми і без
     */

    public Character(Place current_location, String name, int health, LinkedList <Can_Move> move) {
        this.current_location = current_location;
        this.cname = name;
        this.health = health;
        this.move = move;
    }

    public Character() {
    }

    /**
     * Гетири і сетери
     */

    public Place getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(Place current_location) {
        this.current_location = current_location;
    }

    public String getName() {
        return cname;
    }

    public void setName(String name) {
        this.cname = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public LinkedList<Can_Move> getMove() {
        return move;
    }

    public void setMove(LinkedList<Can_Move> move) {
        this.move = move;
    }


    /**
     * функція порівняння
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return health == character.health &&
                Objects.equals(current_location, character.current_location) &&
                Objects.equals(cname, character.cname) &&
                Objects.equals(move, character.move);
    }

    /**
     * хеш-код
     */

    @Override
    public int hashCode() {

        return Objects.hash(current_location, cname, health, move);
    }

    /**
     * перезавантажена функція toString
     */

    @Override
    public String toString() {
        return "Character.Character{" +
                "current_location=" + current_location +
                ", name='" + cname + '\'' +
                ", health=" + health +
                ", move=" + move +
                '}';
    }
}
