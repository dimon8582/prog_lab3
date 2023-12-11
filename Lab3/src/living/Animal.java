package living;

import enums.Habitat;

public abstract class Animal extends Entity {
    int cuteness = 0;
    Habitat habitat;

    public Animal(String name, int age, Habitat habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public int getCuteness() {
        return cuteness;
    }

    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}
