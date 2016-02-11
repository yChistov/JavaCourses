package prog.oop.Lessons_2.Shapes;

public abstract class Shape {

    public Shape(){
        System.out.println("Shape constructor");
    }

    public abstract String getName();
    public abstract double getArea();
}
