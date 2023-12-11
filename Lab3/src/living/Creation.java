package living;

import interfaces.Walkable;

public abstract class Creation extends Entity implements Walkable {
    public Creation(String name, int age) {
        super(name, age);
    }

    int intelligence;

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

}
