package prog.oop.Lessons_2.Students;

/* Сделать поиск по фамилии
   Сделать поиск по дате рождения
   Сделать ф-юудаления студента из списка
   Предусмотреть выход за пределы списка*/

import java.util.Date;

public class MyClass {

    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
        sl.add(new Student("Petya", "Pushkin", new Date(2000, 4, 15)));
        sl.add(new Student("Jon", "Wick", new Date(1988, 2, 14)));
        sl.add(new Student("Jora", "Man", new Date(1802, 3, 14)));

        sl.showList();
        System.out.println();
        int n = sl.find("Petya");
        System.out.println(sl.getNameSurname(n) + ": " + sl.get(n).getBirth());
        int sn = sl.findSurname("Wick");
        System.out.println(sl.getNameSurname(sn) + ": " + sl.get(n).getBirth());
        int b = sl.findBirth((new Date(1802, 3, 14)));
        System.out.println(sl.getNameSurname(b) + ": " + sl.get(n).getBirth());

        sl.delete(0);
        sl.delete(3);

        System.out.println();
        sl.showList();


    }
}
