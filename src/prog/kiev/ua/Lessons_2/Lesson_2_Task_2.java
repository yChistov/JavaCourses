package prog.kiev.ua.Lessons_2;
/*
1. Прочитать с консоли число 1
2. Прочитать с консоли число 2
3. Вывести результат
4. И так для каждого оператора */

import java.util.Scanner;

public class Lesson_2_Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something:\n");
        int x = scanner.nextInt();
        System.out.println("You printed:\nx = " + x);

        System.out.print("Enter something:\n");
        int y = scanner.nextInt();
        System.out.println("You printed:\ny = " + x);

        Scanner src = new Scanner(System.in);

        System.out.print("Enter something:\n");
        String  z = src.nextLine();
        System.out.println("You printed:\nz = " + z);


        System.out.println("\n(x + y) = " + (x + y));
        System.out.println("(x - y) = " + (x - y));
        System.out.println("(x * y) = " + (x * y));
        System.out.println("(x / y) = " + (x / y));
    }
}
