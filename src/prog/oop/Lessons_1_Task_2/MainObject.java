package prog.oop.Lessons_1_Task_2;

import java.util.Scanner;

public class MainObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            new MyObject();
        }
        System.out.println("Quantity of objects is: " + MyObject.getCount());
    }
}
