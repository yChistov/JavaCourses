package prog.AutoQA.Lessons_2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input height:");
        int h = sc.nextInt();

        for (int i = 0; i <= h * 2; i++) {
            if (i <= h) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = h * 2 - i; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}



