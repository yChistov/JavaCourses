package prog.oop.Lessons_3.MultiThreadCounter;

import java.util.ArrayList;

public class MainMyThread {
    public static void main(String[] args) {

        ArrayList<MyThread> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            MyThread thr = new MyThread();
            thr.start();
            list.add(thr);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (MyThread myThread : list) {
            myThread.interrupt();
        }
    }
}
