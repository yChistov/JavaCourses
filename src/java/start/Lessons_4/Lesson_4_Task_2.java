package java.start.Lessons_4;

/* Вывести на экран все числа от 1 до 100, которые
делятся на 3 без остатка. */

public class Lesson_4_Task_2 {

    public static void main(String[] args) {
        int[] x = new int[100];
        for (int i = 0; i < x.length; i += 3) {
            System.out.println(i);
        }
    }
}



