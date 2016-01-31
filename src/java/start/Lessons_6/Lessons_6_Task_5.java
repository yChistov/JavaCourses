package java.start.Lessons_6;

/*Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран(“10” -> 2)*/

import java.util.Scanner;

public class Lessons_6_Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in binary format: ");
        String binary = scanner.nextLine();
        int number = Integer.parseInt(binary, 2);
        System.out.println("('" + binary + "' -> " + number + ")");
    }
}