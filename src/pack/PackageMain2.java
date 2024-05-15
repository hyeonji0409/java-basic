package pack;

import pack.a.User;
import pack.a.User2;

// 이렇게 적음으면 pack.a 아래에 있는 모든 것을 포함한다는 것을 의미
import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();

        // pack.a.user로 불러오면 귀찮기 때문에 Class 상단에 import pack.a.User를 적음으로써 간단히 적을 수 있다.
        User user = new User();
        User2 user2 = new User2();
    }
}
