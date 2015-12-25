package prog.kiev.ua;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_Task2 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = src.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        int tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}