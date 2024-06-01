package poly.diamond;

// interface는 다중 구현 가능
public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // 양쪽에 다 있지만 같은 메서드이므로 하나만 구현하면 됨.
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
