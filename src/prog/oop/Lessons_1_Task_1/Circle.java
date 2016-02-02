package prog.oop.Lessons_1_Task_1;

/* Написать класс Circle (круг)по аналогии с Rectangleи метод, который будет возвращать его площадь.*/

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.pow(radius, 2) * Math.PI;
    }
}