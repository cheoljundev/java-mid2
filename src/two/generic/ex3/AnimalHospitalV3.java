package two.generic.ex3;

import two.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    // Animal 클래스의 메서드를 사용 가능해진다. 타입 매개변수 제한.
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public T get() {
        return animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal
                : animal.getSize() < target.getSize() ? target
                : null;
    }
}
