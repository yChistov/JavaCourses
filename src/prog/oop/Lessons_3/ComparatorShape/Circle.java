package prog.oop.Lessons_3.ComparatorShape;

public class Circle extends Shape {

    private static final String name = "Circle";
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
