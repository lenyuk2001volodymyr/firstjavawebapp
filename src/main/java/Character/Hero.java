package Character;

import Person_Char.Characteristic;
import Person_Char.Weapon;

import java.util.Objects;

public class Hero extends Character {

    /**
     * Опис змінних
     */

    private Weapon heroWeapon;
    private String heroName = new String();
    private int level;
    private int score;
    private int visibleRadius;
    private Characteristic heroCharacteristic;

    /**
     * Конструктори з параметроми і без
     */

    public Hero(Weapon heroWeapon, String heroName, int level, int score, int visibleRadius, Characteristic heroCharacteristic) {
        this.heroWeapon = heroWeapon;
        this.heroName = heroName;
        this.level = level;
        this.score = score;
        this.visibleRadius = visibleRadius;
        this.heroCharacteristic = heroCharacteristic;
    }

    public Hero() {
    }

    /**
     * Гетири і сетери
     */

    public Weapon getHeroWeapon() {
        return heroWeapon;
    }

    public void setHeroWeapon(Weapon heroWeapon) {
        this.heroWeapon = heroWeapon;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getVisibleRadius() {
        return visibleRadius;
    }

    public void setVisibleRadius(int visibleRadius) {
        this.visibleRadius = visibleRadius;
    }

    public Characteristic getHeroCharacteristic() {
        return heroCharacteristic;
    }

    public void setHeroCharacteristic(Characteristic heroCharacteristic) {
        this.heroCharacteristic = heroCharacteristic;
    }

    /**
     * функція порівняння
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hero hero = (Hero) o;
        return level == hero.level &&
                score == hero.score &&
                visibleRadius == hero.visibleRadius &&
                Objects.equals(heroWeapon, hero.heroWeapon) &&
                Objects.equals(heroName, hero.heroName) &&
                Objects.equals(heroCharacteristic, hero.heroCharacteristic);
    }

    /**
     * хеш-код
     */

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), heroWeapon, heroName, level, score, visibleRadius, heroCharacteristic);
    }

    /**
     * перезавантажена функція toString
     */

    @Override
    public String toString() {
        return "Hero{" +
                "heroWeapon=" + heroWeapon +
                ", heroName='" + heroName + '\'' +
                ", level=" + level +
                ", score=" + score +
                ", visibleRadius=" + visibleRadius +
                ", heroCharacteristic=" + heroCharacteristic +
                '}';
    }
}
