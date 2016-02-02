package prog.start.Lessons_4;

/* Найти в массиве чисел элементы с наибольшим и
наименьшим значениями. */

import java.util.Scanner;

public class Lesson_4_Task_6 {

    public static void main(String[] args)	{

        Scanner src = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n;
        n = src.nextInt();
        int[] x = new int[n];
        int min, max;
        System.out.println("Enter the array of " + n + " numbers ");
        for	(int i = 0;	i <	x.length; i++) {
            x[i] = src.nextInt();
        }
        max	= x[0];
        min	= x[0];
        for	(int i = 1;	i <	x.length; i++) {
            if (min > x[i]){
                min = x[i];
            }
            if (max < x[i]){
                max = x[i];
            }
        }
        if	(min!=max) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] == max) {
                    x[i] = min;
                } else if (x[i] == min) {
                    x[i] = max;
                }
            }
        }
        System.out.println("\nmin = " + min);
        System.out.println("max = " + max);
    }
}
