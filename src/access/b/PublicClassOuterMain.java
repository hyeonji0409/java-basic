package access.b;

import access.a.DefaultClass1;
import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // pacage access.a에 있는 클래스를 access.b에서 호출. default라는 접근 제어자를 사용하기 때문에 접근이 불가하다.
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
    }
}
