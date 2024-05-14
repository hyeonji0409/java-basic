package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        // 실행하는 순간 생성자 호출
        MemberConstruct member1 = new MemberConstruct("user1", 18, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 14, 87);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);
        }
    }
}
