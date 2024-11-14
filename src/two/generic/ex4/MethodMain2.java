package two.generic.ex4;

import two.generic.animal.Animal;
import two.generic.animal.Cat;
import two.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이", 200);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog biggerDog = AnimalMethod.bigger(dog, new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
