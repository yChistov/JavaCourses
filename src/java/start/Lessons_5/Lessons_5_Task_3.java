package java.start.Lessons_5;

/*      Написать ф-ю, которая принимает на вход массив чисел и
        возвращает его длину в байтах как результат*/

public class Lessons_5_Task_3 {

    public static void main(String[] args) {
        byte[] a = {2, 6, 89, 3, 6, 3, 7, 0};
        arr(a);
        System.out.println(arr(a));
    }

    public static int arr(byte[] a){
        return a.length;
    }
}
