package prog.oop.Lessons_2.Cars;

public class Car {
    private String name;
    private Engine engine;
    private Climate climate = new Climate();
    private double fuel;

    
    public Car(String name, double volume) {
        this.name = name;
        engine = new Engine(0, volume);
    }
    
    public Car(String name, double mileage, double volume) {
        this.name = name;
        engine = new Engine(mileage, volume);
    }
    
    public String getName() {
        return name;
    }
    
    public double getMileage() {
        return engine.getMileage();
    }

    public double getFuel(){
        return fuel;
    }

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        climate.turnOff();
    	engine.turnOff();
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
        	double distance = hours * speed;
        	engine.addMileage(distance);
            double fuel = (distance / 100) * engine.getConsumption(engine.getVolume());
            this.fuel += fuel;
        }
    }
}