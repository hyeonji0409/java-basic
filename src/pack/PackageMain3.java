package pack;

import pack.a.User;

// 이렇게 적음으면 pack.a 아래에 있는 모든 것을 포함한다는 것을 의미


public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();

        User user = new User();

        // 같은 이름을 가진 클래스는 모두 import문을 사용해서 가져올 수 없다.
        pack.b.User user1 = new pack.b.User();
    }
}
