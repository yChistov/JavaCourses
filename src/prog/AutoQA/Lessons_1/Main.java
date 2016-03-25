package prog.AutoQA.Lessons_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data:");
        String[] arr = scanner.nextLine().split("");
        System.out.println("Output data:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
