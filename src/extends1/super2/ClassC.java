package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); // 기본 생성자가 없어서 super 생략이 불가능하며, 직접 값을 넣어줘야 한다.
        System.out.println("ClassC 생성자");
    }
}
