package prog.start.Lessons_4;

/* С помощью консоли пользователь вводит
математическое выражение типа “1+33-4*7”. Написать
программу для подсчета его значения. Приоритет
операций не учитывается */

import java.util.Scanner;

public class Lesson_4_Task_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int a = scanner.nextInt();
        System.out.println("Введите любое число:");
        int b = scanner.nextInt();
        System.out.println("Введите любое число:");
        int c = scanner.nextInt();
        System.out.println("Введите любое число:");
        int d = scanner.nextInt();
        int s = a + b - c * d;
        System.out.println("s = " + s);
    }
}

