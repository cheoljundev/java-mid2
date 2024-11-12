package one.generic.test.ex5;

import one.generic.animal.Animal;
import one.generic.animal.Cat;
import one.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));


        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        System.out.println("dog = " + dog);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        System.out.println("animal = " + animal);
    }
}
