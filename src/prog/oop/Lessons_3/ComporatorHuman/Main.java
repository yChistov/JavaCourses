package prog.oop.Lessons_3.ComporatorHuman;

/*      Модифицировать код для сортировки Human чтобы
        элементы упорядочивались по убыванию*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human[] list = {new Human(40), new Human(20), new Human(30), new Human(7)};


        Arrays.sort(list, new HumanComparator().reversed());

        for (Human h : list)
            System.out.println(h.getAge());
    }
}