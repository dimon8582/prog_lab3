package living;

import enums.DogBreed;
import enums.Habitat;
import interfaces.Walkable;

public class Dog extends Animal implements Walkable {
    DogBreed breed;
    public Dog(String name, int age, DogBreed breed) {
        super(name, age, Habitat.GROUND);
        this.breed = breed;
    }

    public void bark() {
        System.out.printf("Собака %s лает\n", this.name);
    }
    public void barkAt(Entity entity) {
        System.out.printf("Собака %s лает на %s\n", this.name, entity.getName());
    }

    public void sniff(Entity entity) {
        System.out.printf("Собака %s обнюхивает %s\n", this.name, entity.getName());
    }
    public DogBreed getBreed() {
        return breed;
    }
}
