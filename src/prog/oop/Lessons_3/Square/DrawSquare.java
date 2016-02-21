package prog.oop.Lessons_3.Square;

/*  Написать программу, которая будет рисовать на консоли прямоугольник с заданными длинами сторон*/

import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your side - a");
        int a = scanner.nextInt();
        System.out.println("Enter your side - b");
        int b = scanner.nextInt();

        String [][] sqr = new String[a][b];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b ; j++){
                sqr[i][j] = ".";
            }
        }
        for (int i = 1; i < a-1; i++){
            for (int j = 1; j < b-1 ; j++){
                sqr[i][j] = " ";
            }
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b ; j++){
                System.out.print(sqr[i][j]);
            }
            System.out.println();
        }
    }
}