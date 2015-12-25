package prog.kiev.ua;

public class Lesson3_Task4 {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 2, 5, 8, 4, 2, 5, 7};
        int s = 0;

        for (int i = 0; i < arr.length; i++){
            s += arr[i];
        }
        System.out.println(s / arr.length);
    }
}