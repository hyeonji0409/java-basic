package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // 학생1 데이터 정의
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 95;

        // 학생2 데이터 정의
        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 85;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            // 그냥 student를 호출하게 되면 주소값이 호출됨.
            System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        }

    }
}
