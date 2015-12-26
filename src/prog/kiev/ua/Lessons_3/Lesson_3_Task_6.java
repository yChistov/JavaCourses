package prog.kiev.ua.Lessons_3;

/* Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
элементами, а затем выводить нужный элемент по его индексу на консоль. */

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3_Task_6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = src.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++){
            System.out.println("Enter " + i + "th element: ");
            arr1[i] = src.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("\nEnter the index of the item (0 to " + (arr1.length-1) + "):" );
        int j = src.nextInt();
        System.out.println(j + "-th:");
        System.out.println(arr1[j]);
    }
}