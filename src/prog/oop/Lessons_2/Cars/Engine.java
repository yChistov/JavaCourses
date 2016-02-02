package prog.oop.Lessons_2.Cars;

public class Engine {
    private double mileage;
    private double volume;
    private boolean started;
    
    public Engine(double mileage, double volume) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public static double getConsumption(double volume) {
        if (volume == 1.6)
            return 8;
        else if (volume == 1.8)
            return 10;
        else if (volume == 2.0)
            return 12;
        else
            return 0;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public double getVolume(){
        return volume;
    }
    
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }
}
