package prog.oop.Lessons_3.MultiThreadCounter;

/*  Модифицировать класс Counter так, чтобы он циклически выводил числа из определенного диапазона.*/


import java.text.SimpleDateFormat;
import java.util.Date;

public class Counter extends Thread {

    private int start;
    private int end;

    public Counter(int start, int end) {
        if(start < end){
            this.start = start;
            this.end = end;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void run() {
        while ( ! isInterrupted()) {
            Date curTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            for (int i = start; i <= end; i++) {
                System.out.println(i + " ");
            }
            try {
                System.out.println(sdf.format(curTime.getTime()));
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public int getStart(){
        return start;
    }

    public void setStart(int start){
        this.start = start;
    }

    public int getEnd(){
        return end;
    }

    public void setEnd(int end){
        this.end = end;
    }
}