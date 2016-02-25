package prog.oop.Lessons_3.ComporatorHuman;

import prog.oop.Lessons_3.ComporatorHuman.Human;

import java.util.Comparator;

class HumanComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Human h1 = (Human)o1;
        Human h2 = (Human)o2;

        if (h1.getAge() > h2.getAge())
            return -1;
        else if (h1.getAge() == h2.getAge())
            return 0;
        else if (h1.getAge() < h2.getAge())
            return 1;
        return 0; // make compiler happy
    }
}