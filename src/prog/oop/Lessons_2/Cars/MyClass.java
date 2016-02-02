package prog.oop.Lessons_2.Cars;

/*  1. Добавить свойство «объем двигателя» в класс Engine.
    2. Написать код для вывода потраченного топлива на экран.*/

public class MyClass {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 1.6);
        Car ferrari = new Car("Ferrari", 20000, 2.0);
            
        bmw.turnOn();
        ferrari.turnOn();
            
        final int[] speeds = new int[] {20, 60, 100};
            
        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);
            
        bmw.turnOff();
        ferrari.turnOff();
            
        System.out.println(bmw.getName() + ": " + "mileage: " + bmw.getMileage() +
                " km, consumption: " + bmw.getFuel() + " liters");
        System.out.println(ferrari.getName() + ": " + "mileage: " + ferrari.getMileage() +
                " km, consumption: " + ferrari.getFuel() + " liters");

    }
}
