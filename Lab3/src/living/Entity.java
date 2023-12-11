


package living;

import enums.Emotion;

import java.util.Objects;

public
class Entity {
    String name;
    int age;
    Emotion emotion;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
        System.out.printf("%s %s\n", this.name, emotion.getIncase());
    }

    public void think(String thought) {
        System.out.printf("%s думает: \"%s\"\n", this.name, thought);
    }

    public void eat(String food) {
        System.out.printf("%s ест %s\n", this.name, food);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Entity)) return false;
        Entity e2 = (Entity) obj;
        return Objects.equals(e2.name, this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) * 11 + age * 31;
    }

    @Override
    public String toString() {
        return name;
    }
}