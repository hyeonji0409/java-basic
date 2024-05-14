package construct;

public class MemberThis {
    String nameField;

    void initMember(String memberParameter){
        nameField = memberParameter; // 앞에 this 생략된 사례.
    }
}
