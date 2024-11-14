package two.generic.ex3;

import two.generic.animal.Cat;
import two.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 문제1 : cat에 컴파일 오류 발생하지 않음
        dogHospital.set(cat);

        dogHospital.set(dog);
        dogHospital.checkUp();

        // 문제 2: 다운캐스팅 필요
        Dog bigger = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigger = " + bigger);

    }
}
