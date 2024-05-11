package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData vd = new ValueData();

        add(vd);
        add(vd);
        add(vd);
        System.out.println("최종 숫자: " + vd.value);
    }

    static void add(ValueData vd){
        vd.value++;
        System.out.println("숫자 증가: " + vd.value);
    }
}
