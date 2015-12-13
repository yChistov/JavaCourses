package prog.kiev.ua;

public class Task_1 {

    public static void main(String[] args) {

        long s1 = Short.MAX_VALUE;
        double s2 = 45.1;
        float s3 = (float) (s1 + s2);

        System.out.println("First:\n" + (s1 + s3));
        System.out.println("Third:\n" + (s3 + s2 + s1));
        System.out.println("Second:\n" + (s1 + s2 + s3));

    }
}
