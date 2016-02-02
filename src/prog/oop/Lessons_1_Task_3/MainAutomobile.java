package prog.oop.Lessons_1_Task_3;

public class MainAutomobile {
    public static void main(String[] args) {
        Automobile car = new Automobile();
        car.setMarkka("Audi");
        car.engineOn();
        car.drive();
        car.keepSpeed(80);
        car.engineOff();
        System.out.println(car.getMarkka());
    }
}
