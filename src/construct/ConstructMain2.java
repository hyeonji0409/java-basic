package construct;

// 오버로딩 확인
public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 18, 90);
        // 위와 같은 이름이지만 매개변수에서 성적을 빼고 정의했기 때문에 생성자에 기본으로 입력되어 있던 50이 출력된다.
        MemberConstruct member2 = new MemberConstruct("user2", 14);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
