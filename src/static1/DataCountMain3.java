package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // class에 직접 접근해서 count값 가져옴.
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근 -> 권장하지 않음.
        // --> count가 인스턴스 변수처럼 보인다. 하지만 클래스를 통해 접근하면 static 변수라는 것이 직관적으로 보인다.
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count);

        // class를 통한 접근
        System.out.println(Data3.count);
    }
}
