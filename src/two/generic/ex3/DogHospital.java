package two.generic.ex3;

import two.generic.animal.Animal;
import two.generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal
                : animal.getSize() < target.getSize() ? target
                : null;
    }

}
