package class1;

import javax.swing.*;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 95;

        // 학생2 데이터 정의
        Student student2;
        student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 85;

        Student[] students = new Student[]{student1, student2};

        for(int i=0;i<students.length;i++){
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade); ;
        }

        for(int i=0;i<students.length;i++){
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        for(Student s : students){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        // iter 단축키 누르면 자동 생성
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);

        }
    }
}
