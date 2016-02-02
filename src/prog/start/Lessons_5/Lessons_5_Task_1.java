package prog.start.Lessons_5;

/*      Написать функцию, которая принимает в качестве аргументов
        одну строку X, целое число Y и число с плавающей точкой Z и
        возвращает как результат строку в виде
        S = x + y + z*/

public class Lessons_5_Task_1 {

    public static String sum(String x, int y, double z){
        return "S = " + x + " + " + y + " + "  + z;
    }

    public static void main(String[] args) {

        System.out.println(sum("15", 4, 4.6));
    }
}
