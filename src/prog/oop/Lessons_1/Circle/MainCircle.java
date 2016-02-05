package prog.oop.Lessons_1.Circle;


import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Square = " + circle.getSquare());

    }
}