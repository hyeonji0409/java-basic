package oop1.ex;

import org.w3c.dom.ls.LSOutput;

public class RectangleProcedureMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculateParameter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculateParameter(int width, int height){
        return 2*(width + height);
    }

    // 가로 세로 같은지 확인하는 것이므로 boolen 활용
    static boolean isSquare(int width, int height) {
        return  width == height;
    }
}
