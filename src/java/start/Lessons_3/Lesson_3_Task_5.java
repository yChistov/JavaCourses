package java.start.Lessons_3;

/* Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).*/

import java.util.Arrays;

public class Lesson_3_Task_5 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[arr1.length];

        int j = 0;

        for (int i = 0; i < arr1.length; i++){
            arr2[j++] = arr1[arr1.length-i-1];
        }
        System.out.println("Your array = " + Arrays.toString(arr1));
        System.out.println("Mirror array = " +Arrays.toString(arr2));
    }
}
