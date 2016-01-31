package java.start.Lessons_3;
/*
Задача 4:
1. Среднее арифметическое элементов массива.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_3_Task_4 {

    public static void main(String[] args) {
        Random r = new Random(47);
        Scanner src = new Scanner(System.in);
        int n;
        int s = 0;
        System.out.println("Enter length of the array: ");
        n = src.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
            s += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("s = " + s / arr.length);
    }
}