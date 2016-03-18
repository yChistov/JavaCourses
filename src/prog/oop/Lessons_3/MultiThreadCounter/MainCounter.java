package prog.oop.Lessons_3.MultiThreadCounter;

import java.util.Scanner;

public class MainCounter {
    public static void main(String[] args) {

        try {
            System.out.println("To ended this program enter 'stop'");
            Counter c = new Counter(0, 10);
            c.start();
            Scanner scanner = new Scanner(System.in);
            while (true){
                String s = scanner.nextLine();
                if (s.equals("stop")){
                    c.interrupt();
                    break;
                }
            }
        } catch (IllegalArgumentException ex){
            ex.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
