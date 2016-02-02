package prog.start.Lessons_5;

/*      Написать функцию, которая принимает массив чисел в качестве
        аргумента, увеличивает его первые 3 элемента на 1 и
        возвращает их сумму как результат. После изменения массив и
        сумму надо вывести на экран*/

import java.util.Arrays;

public class Lessons_5_Task_2 {

    public static void main(String[] args) {
        int[] x = {4, 5, 78, 2, 7, 23, 678, 6, 8};
        array(x);
    }

    public static void array(int[] x){
        int sum = 0;
        x[0] = x[0] + 1; sum += x[0];
        x[1] = x[1] + 1; sum += x[1];
        x[2] = x[2] + 1; sum += x[2];
        System.out.println(Arrays.toString(x));
        System.out.println(sum);
    }
}
