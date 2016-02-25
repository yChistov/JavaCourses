package prog.oop.Lessons_3.ComparatorShape;

/*      Создать список фигур. Реализовать сортировку списка по
        возрастанию площади фигуры*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] list = {
                new Circle(5),
                new Rectangle(5, 3),
                new Triangle(2, 5, 30)
        };

        System.out.println("------Not Sorted-----");

        for (Shape s : list){
            System.out.println(s.getName() + ": "+s.getArea());
        }
        System.out.println("------Sorted------");

        Arrays.sort(list, new ShapeComparator().reversed());
        for (Shape s : list){
            System.out.println(s.getName() + ": "+s.getArea());
        }
    }
}

