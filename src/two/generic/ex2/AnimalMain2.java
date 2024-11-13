package two.generic.ex2;

import two.generic.animal.Animal;
import two.generic.animal.Cat;
import two.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 200);
        Cat cat = new Cat("고양이", 100);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
