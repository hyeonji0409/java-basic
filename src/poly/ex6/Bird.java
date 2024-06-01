package poly.ex6;

// 하나의 클래스에서 extends를 통해 하나의 상속이 가능하고 implements를 통한 인터페이스는 다중 구현이 가능하다.
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
