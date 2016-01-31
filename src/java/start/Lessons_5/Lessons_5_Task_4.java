package java.start.Lessons_5;

/*      Написать ф-ю для объединения 2-х массивов в один. Вывести
        результат на консоль.*/

import java.util.Arrays;

public class Lessons_5_Task_4 {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 4};
        System.out.println(union(a1, a2));
    }

    public static String union(int[] a1, int[] a2){
        int[] a3 = new int [a1.length + a2.length];
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        return Arrays.toString(a3);
    }
}
