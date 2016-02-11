package prog.oop.Lessons_2.Shapes;

/*
        Написать иерархию классов «Фигуры». Фигура ->
        Треугольник -> Прямоугольник -> Круг. Реализовать ф-ю
        подсчета площади для каждого типа фигуры.
*/

public class ShapeMain {

    public static void main(String[] args) {

        Shape[] shape = {
                new Circle(10),
                new Rectangle(2, 5),
                new Triangle(2, 5, 30)};

        for (Shape x : shape){
            System.out.println("Area of a " + x.getName() + " = " + x.getArea());
        }
    }
}
