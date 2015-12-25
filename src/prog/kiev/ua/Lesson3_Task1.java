package prog.kiev.ua;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_Task1 {

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
        System.out.println("Your array = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sort array = " + Arrays.toString(arr));
        src.close();
    }
}