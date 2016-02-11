package prog.oop.Lessons_2.Shapes;

public class Rectangle extends Shape {

    private static final String name = "Rectangle";
    private int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        System.out.println("Rectangle constructor");
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
