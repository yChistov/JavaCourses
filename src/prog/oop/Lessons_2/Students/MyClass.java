package prog.oop.Lessons_2.Students;

import java.util.Date;

public class MyClass {

    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
        sl.add(new Student("Petya", "Pushkin", new Date(2000, 4, 15)));
        sl.add(new Student("Jon", "Wick", new Date(1988, 2, 14)));

        int n = sl.find("Petya");
        int sn = sl.findSurname("Wick");
        int b = sl.findBirth("1988");

        System.out.println(sl.get(n).getBirth().toString());
        System.out.println(sl.get(sn).getBirth().toString());
        System.out.println(sl.get(b).getBirth().toString());

    }
}
