package oop1;

public class ValueObject {
    int value;

    // 객체 본인이 스스로의 기능을 함께 포함하고 있다.
    void add() {
        value++;
        System.out.println("숫자 증가 value= " + value);
    }
}
