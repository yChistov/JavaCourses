package prog.kiev.ua.Lessons_6;

/*      Написать код, который позволит менять и читать значения
        произвольных битов в массиве int-ов.*/

import java.util.Arrays;
import java.util.Scanner;

public class Lessons_6_Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter value: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            String s = Integer.toBinaryString(arr[i]);
            System.out.println("Index of the array element: " + i + ". Value: " + arr[i] + ". Number of bits: " + s);
        }

        System.out.println("Enter the index of the array element: ");
        int a = scanner.nextInt();
        System.out.println("Enter the number of bits: ");
        int b = scanner.nextInt();
        arr[a] = arr[a] ^ (1 << b);
        for (int i = 0; i < arr.length; i++){
            String s = Integer.toBinaryString(arr[i]);
            System.out.println("Index of the array element: " + i + ". Value: " + arr[i] + ". Number of bits: " + s);
        }
    }
}

