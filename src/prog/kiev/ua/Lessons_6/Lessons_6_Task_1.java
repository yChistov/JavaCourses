package prog.kiev.ua.Lessons_6;

    /*  Ввести с консоли дату. Сравнить ее с текущей датой в
        системе. Вывести отличающиеся части (год, месяц) на
        экран.*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lessons_6_Task_1 {
    public static void main(String[] args) {

        Date currentDate = new Date(System.currentTimeMillis());
        System.out.println(currentDate);

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy MM dd HH:mm:ss");

        System.out.println("Enter the date: ");
        String dtStr = scan.nextLine();

        try {
            Date date = simpleDate.parse(dtStr);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Wrong Date!!!");
        }
        scan.close();
    }
}
