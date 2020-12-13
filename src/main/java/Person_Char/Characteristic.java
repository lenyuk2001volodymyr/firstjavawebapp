package Person_Char;

import java.util.Objects;

public class Characteristic {

    /**
     * Опис змінних
     */

    private int luck;
    private int power;
    private int intellect;
    private int agility;

    /**
     * Конструктори з параметроми і без
     */

    public Characteristic(int luck, int power, int intellect, int agility) {
        this.luck = luck;
        this.power = power;
        this.intellect = intellect;
        this.agility = agility;
    }

    public Characteristic() {
    }

    /**
     * Гетири і сетери
     */

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * функція порівняння
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characteristic that = (Characteristic) o;
        return luck == that.luck &&
                power == that.power &&
                intellect == that.intellect &&
                agility == that.agility;
    }

    /**
     * хеш-код
     */

    @Override
    public int hashCode() {

        return Objects.hash(luck, power, intellect, agility);
    }

    /**
     * перезавантажена функція toString
     */

    @Override
    public String toString() {
        return "Person_Char.Characteristic{" +
                "luck=" + luck +
                ", power=" + power +
                ", intellect=" + intellect +
                ", agility=" + agility +
                '}';
    }
}
