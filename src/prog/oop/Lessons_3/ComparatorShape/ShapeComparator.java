package prog.oop.Lessons_3.ComparatorShape;

import java.util.Comparator;

public class ShapeComparator implements Comparator <Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {

        if (s1.getArea() > s2.getArea())
            return -1;
        else if (s1.getArea() == s2.getArea())
            return 0;
        else if (s1.getArea() < s2.getArea())
            return 1;
        return 0; // make compiler happy
    }
}