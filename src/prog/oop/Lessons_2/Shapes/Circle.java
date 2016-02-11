package prog.oop.Lessons_2.Shapes;

public class Circle extends Shape {

    private static final String name = "Circle";
    private int radius;

    public Circle(int radius){
        this.radius = radius;
        System.out.println("Circle constructor");
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
