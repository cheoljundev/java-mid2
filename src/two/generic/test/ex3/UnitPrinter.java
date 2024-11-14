package two.generic.test.ex3;

import two.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    static <T extends Shuttle> void printV1(T shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("이름: " + unit.getName() + " HP: " + unit.getHp());
    }

    static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("이름: " + unit.getName() + " HP: " + unit.getHp());
    }
}
