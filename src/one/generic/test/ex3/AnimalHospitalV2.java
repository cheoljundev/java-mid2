package one.generic.test.ex3;


public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        // T의 타입을 메서드 정의 시점에는 알 수 없다. Object의 기능만 사용 가능
        //animal.toString();
        //animal.equals();

        // System.out.println("동물 이름 : " + animal.getName());
        // System.out.println("동물 크기 : " + animal.getSize());
        // animal.sound();
    }

    public T bigger(T target) {
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
