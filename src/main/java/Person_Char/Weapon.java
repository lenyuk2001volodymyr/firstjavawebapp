package Person_Char;

import java.util.Objects;

public class Weapon {

    /**
     * Опис змінних
     */

    private String name = new String();//Назва зброї
    private int damage;//Шкода від удару
    private int kickback_chance;//Шанс нанести удар у відповідь
    private int defend_chance;//Шанс заблокувати удар
    private int critical_damage_chance;//Шанс нанести критичного ужкодження

    /**
     * Конструктори з параметроми і без
     */

    public Weapon(String name, int damege, int kickback_chance, int defend_chance, int critical_damege_chance) {
        this.name = name;
        this.damage = damege;
        this.kickback_chance = kickback_chance;
        this.defend_chance = defend_chance;
        this.critical_damage_chance = critical_damege_chance;
    }

    public Weapon() {
    }

    /**
     * Гетири і сетери
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getKickback_chance() {
        return kickback_chance;
    }

    public void setKickback_chance(int kickback_chance) {
        this.kickback_chance = kickback_chance;
    }

    public int getDefend_chance() {
        return defend_chance;
    }

    public void setDefend_chance(int defend_chance) {
        this.defend_chance = defend_chance;
    }

    public int getCritical_damage_chance() {
        return critical_damage_chance;
    }

    public void setCritical_damage_chance(int critical_damage_chance) {
        this.critical_damage_chance = critical_damage_chance;
    }

    /**
     * функція порівняння
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return damage == weapon.damage &&
                kickback_chance == weapon.kickback_chance &&
                defend_chance == weapon.defend_chance &&
                critical_damage_chance == weapon.critical_damage_chance &&
                Objects.equals(name, weapon.name);
    }

    /**
     * хеш-код
     */

    @Override
    public int hashCode() {

        return Objects.hash(name, damage, kickback_chance, defend_chance, critical_damage_chance);
    }

    /**
     * перезавантажена функція toString
     */

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", kickback_chance=" + kickback_chance +
                ", defend_chance=" + defend_chance +
                ", critical_damage_chance=" + critical_damage_chance +
                '}';
    }
}
