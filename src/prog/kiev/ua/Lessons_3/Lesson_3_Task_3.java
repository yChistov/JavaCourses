package prog.kiev.ua.Lessons_3;
/*
Задача 3:
1. Ввести с клавиатуры массив из 10 чисел.
2. Разбить его на 2 массива равной длинны.
3. Отсортировать каждую из половинок и вывести их содержимое на экран.*/

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3_Task_3 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter First number");
        arr[0] = src.nextInt();
        System.out.println("Enter Second number");
        arr[1] = src.nextInt();
        System.out.println("Enter Third number");
        arr[2] = src.nextInt();
        System.out.println("Enter Fourth number");
        arr[3] = src.nextInt();
        System.out.println("Enter Fifth number");
        arr[4] = src.nextInt();
        System.out.println("Enter Sixth number");
        arr[5] = src.nextInt();
        System.out.println("Enter Seventh number");
        arr[6] = src.nextInt();
        System.out.println("Enter Eight number");
        arr[7] = src.nextInt();
        System.out.println("Enter Ninth number");
        arr[8] = src.nextInt();
        System.out.println("Enter Tenth number");
        arr[9] = src.nextInt();

        int arr1[] = Arrays.copyOfRange(arr, 0, arr.length -5);
        Arrays.sort(arr1);
        int arr2[] = Arrays.copyOfRange(arr, 5, arr.length);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        src.close();
    }
}