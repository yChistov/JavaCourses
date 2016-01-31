package java.start.Lessons_4;

/* Дано массив из 10 целых чисел. Вывести на экран
сумму всех его элементов кроме первого и
последнего. */

import java.util.Arrays;

public class Lesson_4_Task_4 {

    public static void main(String[] args) {
        int[] x = {1, 4, 6, 7, 3, 5, 7, 9, 0, 2};
        System.out.println(Arrays.toString(x));
        int s = 0;
        for (int i = 1; i < x.length - 1; i++) {
            s += x[i];
        }
        System.out.println(s);
    }
}
