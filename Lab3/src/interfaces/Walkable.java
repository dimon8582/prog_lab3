package interfaces;

import enums.Time;
import technical.Location;

public interface Walkable {
    public default void walk(Location at) {
        System.out.printf("%s гуляет в %s\n", this.toString(), at.toString());
    }
    public default void walk(Location at, Time time) {
        System.out.printf("%s гуляет в %s %s\n", this.toString(), at.toString(), time.getIncase());
    }
    public default void walkTo(Location from, Location at) {
        System.out.printf("%s идет в %s из %s\n", this.toString(), at.toString(), from.toString());
    }
    public default void walkTo(Location from, Location at, Time time) {
        System.out.printf("%s гуляет в %s из %s %s\n", this.toString(), at.toString(), from.toString(), time.getIncase());
    }
}
