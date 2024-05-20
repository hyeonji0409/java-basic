package final1;

public class FianlLocalMain {
    public static void main(String[] args) {
        // final 지역변수
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능

        // compile error 파이널 변수는 한 번만 할당이 가능한데 이미 선언이 되었기 때문
//        data1 = 20;

        // 선언과 동시에 초기화
        final int data2 = 10;
//        data2 = 20;

        method(20);
    }

    static void method(final int parameter) {
       // 넘겨받는 값으로 초기화되기 때문에 안에서 변경 불가능
//        parameter = 20;
    }
}
