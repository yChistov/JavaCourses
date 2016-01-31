package java.start.Lessons_6;

    /*  Ввести с консоли дату. Сравнить ее с текущей датой в
        системе. Вывести отличающиеся части (год, месяц) на
        экран.*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Lessons_6_Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        System.out.println("Enter the date: ");
        String dateSt = scanner.nextLine();
        Date date = null;
        try {
            date = simpleDate.parse(dateSt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar someDate = Calendar.getInstance();
        someDate.setTime(date);
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        scanner.close();
        if (!someDate.equals(currentDate)){
            int d2 = currentDate.get(Calendar.DAY_OF_MONTH);
            int d1 = someDate.get(Calendar.DAY_OF_MONTH);
            int m2 = currentDate.get(Calendar.MONTH) + 1;
            int m1 = someDate.get(Calendar.MONTH) + 1;
            int y2 = currentDate.get(Calendar.YEAR);
            int y1 = someDate.get(Calendar.YEAR);
            if(d2 != d1){
                System.out.println("Date entered: " + d1 + " and " + "Current date: " + d2);
            }
            if(m2 != m1){
                System.out.println("Month entered: " + m1 + " and " + "Current month: " + m2);
            }
            if(y2 != y1){
                System.out.println("Year entered: " + y1 + " and " + "Current year: " + y2);
            }
        }
    }
}
