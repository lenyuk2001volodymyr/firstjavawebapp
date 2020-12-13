package Person_Char;

import java.util.Objects;

public class Place {

    /**
     * Опис змінних
     */

    private int x;
    private int y;

    /**
     * Конструктори з параметроми і без
     */

    public Place(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Place() {
    }

    /**
     * Гетири і сетери
     */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * функція порівняння
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return x == place.x &&
                y == place.y;
    }

    /**
     * хеш-код
     */

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    /**
     * перезавантажена функція toString
     */

    @Override
    public String toString() {
        return "Person_Char.Place{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
