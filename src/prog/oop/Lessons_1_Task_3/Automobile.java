package prog.oop.Lessons_1_Task_3;

/* Написать класс «автомобиль», который должен уметь заводится, глушить мотор, ехать и держать необходимую скорость.*/

public class Automobile {

    private int speed;
    private String markka;

    public void setMarkka(String markka){
        this.markka = markka;
    }

    public String getMarkka(){
        return markka;
    }

    public void engineOn(){
        System.out.println(markka + " started up");
    }
    public void engineOff(){
        System.out.println(markka + " stopped");
    }

    public void drive(){
        System.out.println(markka + " ride");
    }

    public void keepSpeed(int speed){
        this.speed += speed;
        System.out.println(markka + "ride at a speed of " + speed);
    }

}
