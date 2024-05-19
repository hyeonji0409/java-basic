package static2;

public class DecoUtil1 {

    // deco 인스턴스는 멤버변수 없이 단순 기능만 제공함.
    // 인스턴스가 필요한 이유는 멤버 변수를 사용하는 목적이 큰데 이 메서드느 사용하는 인스턴스 변수 없이 단순 기능만 제공함.
    public String deco(String str){
        String result = "*" + str + "*";
        return result;
    }
}
