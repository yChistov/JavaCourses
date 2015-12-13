package prog.kiev.ua;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something:\n");
        int x = scanner.nextInt();
        System.out.println("You printed:\n" + x);

        System.out.print("Enter something:\n");
        int y = scanner.nextInt();
        System.out.println("You printed:\n" + x);

        Scanner src = new Scanner(System.in);

        System.out.print("Enter something:\n");
        String  z = src.nextLine();
        System.out.println("You printed:\n" + z);


        System.out.println("\n(x + y) = " + (x + y));
        System.out.println("(x - y) = " + (x - y));
        System.out.println("(x * y) = " + (x * y));
        System.out.println("(x / y) = " + (x / y));
    }
}
