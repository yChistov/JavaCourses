package prog.oop.Lessons_3.ComparatorShape;

public class Triangle extends Shape {

    private static final String name = "Triangle";
    private double sideA, sideB, angle, rad;

    public Triangle(double sideA, double sideB, double angle){
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getAngle(){
        return angle;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        rad = Math.toRadians(angle);
        return ((sideA * sideB) * Math.sin(rad)) / 2;
    }
}
