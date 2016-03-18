package prog.oop.Lessons_3.MultiThreadCounter;

/*  Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.*/

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println(getId() + " started");

        while (! isInterrupted()) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getId() + " interrupted");
                return;
            }
        }
    }
}