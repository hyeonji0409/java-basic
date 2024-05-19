package static2;

// 정적 메서드 자체를 사용하겠다고 선언 가능. 다 사용하고싶다 -> 마지막 *로
import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        // 인스턴스 변수에 접근 -> 참조값이 있어야 함.
        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 실행은 되지만 추천하는 방식은 아님

        // 클래스를 통한 접근
        staticCall();
    }
}
