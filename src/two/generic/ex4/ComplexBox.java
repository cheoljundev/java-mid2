package two.generic.ex4;

import two.generic.animal.Animal;

public class ComplexBox <T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) { // 모호하므로 실제로는 Z 등으로 바꾸자.
        System.out.println("animal.classname = " + animal.getClass().getName());
        System.out.println("t.className = " + t.getClass().getName());
        return t;
    }
}
