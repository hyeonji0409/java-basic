package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // NullMain3에서 bigData에 대한 값이 존재하지 않으므로 참조하는 값을 할당하면 됨.
        bigData.data = new Data();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        // NullPointerException
        // bigData 자체가 null이기 때문에 nullpinterException이 발생한다.
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
