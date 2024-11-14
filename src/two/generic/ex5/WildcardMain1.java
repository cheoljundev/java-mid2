package two.generic.ex5;

import two.generic.animal.Animal;
import two.generic.animal.Cat;
import two.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 200));

//        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

//        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

//        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
