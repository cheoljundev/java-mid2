package two.generic.ex3;

import two.generic.animal.Animal;

public class AnimalHospitalV1 {
    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public Animal get() {
        return animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal
                : animal.getSize() < target.getSize() ? target
                : null;
    }
}
