package technical;

import java.util.Objects;

public class Location {
    String name;
    double latitude;
    double longitude;

    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Location)) return false;
        Location loc = (Location) obj;
        return (loc.name == this.name) && (loc.latitude == loc.latitude) && (loc.longitude == loc.longitude);
    }

    @Override
    public int hashCode() {
        return (int) (Objects.hash(this.name) * 11 + Math.round(latitude * 1000) * 13 + Math.round(longitude * 1000) * 13);
    }

    @Override
    public String toString() {
        return name;
    }
}
