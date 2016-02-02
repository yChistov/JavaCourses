package prog.start.Lessons_4;

/* Написать метод, который заполнит массив
произвольного размера числами по возрастанию,
начиная с центра массива */

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_4_Task_10 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int a = src.nextInt();
        System.out.println(Arrays.toString(mirror(a)));
    }
    private static int[] mirror (int iLength){
        int[] a = new int[iLength];
        for (int i = 0; i < iLength >> 1; i++) {
            a[i] = a[iLength - i - 1] = (iLength >> 1) - i;
        }
        return a;
    }
}

