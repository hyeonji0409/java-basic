package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15,16};
        int[] studentGrades = {90,74};

        for(int i=0; i<studentNames.length;i++){
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}


// 한 명의 데이터가 Name, Age, Grade로 나뉘어져 있기 때문에 데이터 변경에 주의해야 한다. => 좋은 코드가 아님.