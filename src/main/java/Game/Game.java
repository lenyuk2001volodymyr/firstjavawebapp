package Game;

import Character.Hero;
import Person_Char.Characteristic;
import Person_Char.Place;
import Person_Char.Weapon;

import javax.xml.bind.annotation.*;
import java.util.LinkedList;
import java.util.Objects;

@XmlRootElement(name = "Game")
@XmlAccessorType(XmlAccessType.FIELD)

public class Game {

    @XmlElementWrapper(name = "heroes")
    @XmlElements(
            {
                    @XmlElement(name="hero", type= Hero.class),
                    @XmlElement(name="weapon", type= Weapon.class),
                    @XmlElement(name="char", type= Characteristic.class),
                    @XmlElement(name = "place", type = Place.class)
            }
    )

    private LinkedList <Hero> heroes;

    public Game() {
        heroes = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Game{" +
                "heroes=" + heroes +
                '}';
    }

    public LinkedList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(LinkedList<Hero> heroes) {
        this.heroes = heroes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(heroes, game.heroes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(heroes);
    }
}
