package prog.start.Lessons_4;

/* Найти в массиве число, которое повторяется
наибольшее количество раз. Не использовать
коллекции. */

public class Lesson_4_Task_7 {

    public static void main(String[] args) {
        int[] a = {0, 5, 8, 5, 0, 5, 5, 7, 8, 5};
        int[] b = new int[10];
        int n = 0;
        int i;
        int j;
        for (i = 0; i < a.length; i++){
            for (j = 0; j <a.length; j++) {
                if (a[j] == a[i]) {
                    b[i] = b[i]+1;
                    if (b[i] > b[n]){
                        b[n] = b[i];
                        n = i;
                    }
                }
            }
        }
        System.out.println("Number " + a[n] + " repeated " + b[n] + " once.");
    }
}
