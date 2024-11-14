package two.generic.ex3;

import two.generic.animal.Cat;
import two.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        // AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>(); // 타입 매개변수 제한으로 컴파일 오류

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        Dog bigger = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigger = " + bigger);
    }
}
