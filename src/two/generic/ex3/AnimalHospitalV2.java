package two.generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public T get() {
        return animal;
    }

    public void checkUp() {
        // T 타입을 정의하는 시점에는 메서드를 알 수 없다.
        //System.out.println("동물 이름 : " + animal.getName());
        //System.out.println("동물 크기 : " + animal.getSize());
    }

    public T bigger(T target) {
        return null;
        //return animal.getSize() > target.getSize() ? animal
        //        : animal.getSize() < target.getSize() ? target
        //        : null;
    }
}