package two.collection.set;

import two.collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 HashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 이미 hashCode를 오버라이딩 해두었다.
        Integer i = 10;
        String str = "str";
        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("str.hashCode() = " + str.hashCode());

        // hashCode는 마이너스 값도 들어울 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        Member member1 = new Member("memberA");
        Member member2 = new Member("memberA");

        // equals, hashCode를 오버라이딩 한 경우와 하지 않은 경우 비교
        System.out.println("member1 == member2 : " + (member1 == member2));
        System.out.println("member1 equals member2 : " + member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

    }
}
