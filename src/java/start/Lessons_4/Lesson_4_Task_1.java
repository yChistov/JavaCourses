package java.start.Lessons_4;

/* Вывести на экран числа от 10 до 20 с помощью
всех известных циклов. */

public class Lesson_4_Task_1 {

    public static void main(String[] args) {
        int[] x = new int[30];
        // loop for
        for (int i = 10; i < 21; i++) {
            x[i] = i;
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        // loop while
        int i = 9;
        while (i++ < 20) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        // loop do while
        int k = 10;
        do {
            System.out.print(k + ", ");} while(k++ < 20);
        System.out.println(" ");
    }
}

