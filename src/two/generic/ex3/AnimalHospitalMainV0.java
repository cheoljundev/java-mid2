package two.generic.ex3;

import two.generic.animal.Dog;
import two.generic.animal.Cat;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1: 개 병원에 고양이 전달
        // dogHospital.set(cat); // 불가능

        // 문제 2 : 개 타입 반환
        Dog dog2 = dogHospital.bigger(new Dog("멍멍이2", 200));
    }
}
