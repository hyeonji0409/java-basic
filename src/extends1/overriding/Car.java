package extends1.overriding;

public class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }

    // 기능 추가 open door -> 상속받는 모든 클래스가 문 열기 기능을 추가할 수 있음.
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
