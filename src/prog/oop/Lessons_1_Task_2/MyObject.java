package prog.oop.Lessons_1_Task_2;

/* Написать класс, который умеет считать количество созданных объектов этого класса (static).*/

public class MyObject {

    private static int count;

    public MyObject(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}
