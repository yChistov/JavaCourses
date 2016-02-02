package prog.start.Lessons_6;

/*Написать свой вариант ф-и Arrays.equals для short[].*/

public class Lessons_6_Task_2 {
    public static boolean equals(short[] a, short[] b){
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        short[] a = {1, 2, 3, 5, 6, 9};
        short[] b = {1, 2, 3, 5, 6, 9};
        System.out.println(equals(a,b));
    }
}
