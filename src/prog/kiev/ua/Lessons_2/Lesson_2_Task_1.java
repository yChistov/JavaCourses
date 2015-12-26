package prog.kiev.ua.Lessons_2;
/*
1. Прочитать строку 1
2. Прочитать строку 2
3. Прочитать строку 3
4. Вывести на экран
1. S1 + s3
2. S3 + s2 + s1
3. S1 + s2 + s3 */

public class Lesson_2_Task_1 {

    public static void main(String[] args) {

        long s1 = Short.MAX_VALUE;
        double s2 = 45.1;
        float s3 = (float) (s1 + s2);

        System.out.println("First:\n" + (s1 + s3));
        System.out.println("Third:\n" + (s3 + s2 + s1));
        System.out.println("Second:\n" + (s1 + s2 + s3));

    }
}
