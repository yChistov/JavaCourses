package prog.oop.Lessons_1.Automobile;

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
