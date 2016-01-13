package prog.kiev.ua.Lessons_6;

/*Написать свой вариант ф-и Arrays.toString() для int[].*/

public class Lessons_6_Task_3 {

    public static String toString(int[] a){
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < a.length; i++){
            if (i < a.length - 1){
                sb.append(a[i]).append(", ");
            }
            else {
                sb.append(a[i]);
            }
        }
        return sb.append("}").toString();
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 8};
        System.out.println(toString(a));
    }
}
