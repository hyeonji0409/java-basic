package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();

    // move라는 메서드는 추상 메서드가 아니다. 자식 클래스가 오버라이딩 하지 않아도 된다.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
