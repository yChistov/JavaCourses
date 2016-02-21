package prog.oop.Lessons_3.Developers;

/*  Написать код, который разделит список объектов Developer на 3 отдельных списка для Juniors, Seniors и Team Leads.
    Вывести списки на экран*/

import java.util.ArrayList;
import java.util.Random;

public class DividedDevelopersMain {

    public static void main(String[] args) {

        Random random = new Random();
        Developer[] list = new Developer[10];

        ArrayList<String> junior = new ArrayList<>();
        ArrayList<String> middle = new ArrayList<>();
        ArrayList<String> senior = new ArrayList<>();
        ArrayList<String> teamLead = new ArrayList<>();

        int length = list.length;

        String junName = "Junior";
        String midName = "Middle";
        String senName = "Senior";
        String teamName = "TeamLead";

        for (int i = 0; i < length; i++) {
            int n = random.nextInt(4);
            switch (n) {
                case 0:
                    list[i] = new JuniorDeveloper(junName, random.nextInt(1000), random.nextInt(3));
                    break;
                case 1:
                    list[i] = new MiddleDeveloper(midName, random.nextInt(1500), random.nextInt(4));
                    break;
                case 2:
                    list[i] = new SeniorDeveloper(senName, random.nextInt(2000), random.nextInt(5));
                    break;
                case 3:
                    list[i] = new TeamLeadDeveloper(teamName, random.nextInt(3000), random.nextInt(7));
                    break;
            }
        }

        StringBuilder sj, sm, ss, st;

        for (Developer g : list) {
            if (g.getName().equalsIgnoreCase("Junior")) {
                sj = new StringBuilder()
                        .append(g.getName())
                        .append(": ")
                        .append(g.getBasicSalary())
                        .append(" -> ")
                        .append(g.getSalary());

                junior.add(String.valueOf(sj));
            } else if (g.getName().equalsIgnoreCase("Middle")) {
                sm = new StringBuilder()
                        .append(g.getName())
                        .append(": ")
                        .append(g.getBasicSalary())
                        .append(" -> ")
                        .append(g.getSalary());

                middle.add(String.valueOf(sm));
            } else if (g.getName().equalsIgnoreCase("Senior")) {
                ss = new StringBuilder()
                        .append(g.getName())
                        .append(": ")
                        .append(g.getBasicSalary())
                        .append(" -> ")
                        .append(g.getSalary());

                senior.add(String.valueOf(ss));
            } else if (g.getName().equalsIgnoreCase("TeamLead")) {
                st = new StringBuilder()
                        .append(g.getName())
                        .append(": ")
                        .append(g.getBasicSalary())
                        .append(" -> ")
                        .append(g.getSalary());

                teamLead.add(String.valueOf(st));
            }
        }

        System.out.println("-------Junior List-------");
        for (String j : junior) {
            System.out.println(j);
        }

        System.out.println("-------Middle List-------");
        for (String m : middle) {
            System.out.println(m);
        }

        System.out.println("-------Senior List-------");
        for (String s : senior) {
            System.out.println(s);
        }

        System.out.println("-------TeamLead List-------");
        for (String t : teamLead) {
            System.out.println(t);
        }
    }
}
