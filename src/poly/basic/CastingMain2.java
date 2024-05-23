package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 자식의 기능 호출 불가
        // poly.childMethod();

        // 다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // poly를 강제로 Child로 바꿈
        child.childMethod();

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 연산자 우선순위를 위해 (Child)를 먼저 시킨 후 ( (Child) poly) 가 적용되게 함.

    }
}
