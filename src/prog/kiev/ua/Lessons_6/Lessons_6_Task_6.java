package prog.kiev.ua.Lessons_6;

/*Ввести с консоли целое число. Посчитать количество единиц в его бинарном представлении (“1011”–> 3)*/

import java.util.Scanner;

public class Lessons_6_Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int n = scanner.nextInt();

        String b = Integer.toBinaryString(n);

        int count = 0;
        char a = '1';
        char[] c = b.toCharArray();
        for (int i = 0; i < c.length; i++){
            if (c[i] == a){
                count++;
            }
        }
        System.out.println("('" + b + "' -> " + count + ")");
    }
}