package java.start.Lessons_3;
/*
Задача 2:
1. Задать массив целых чисел длинной N эл.
2. Поменять 1-й и последний элемент местами.
3. Вывести массив на экран.*/

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3_Task_2 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = src.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}