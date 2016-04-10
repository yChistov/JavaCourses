package prog.AutoQA.Lessons_3;

import java.util.Random;

public class Cat {
    String name;
    int age, fat;
    boolean sex;

    public Cat(String name, int age, boolean sex, int fat) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public int getFat(){
        return fat;
    }

    public void voice(){
        System.out.println(this.name + " say myau!");
    }

    public Cat makeLove(Cat anotherCat){
        Random rn = new Random();
        if (this.isSex() != anotherCat.isSex()){
            System.out.println(this.getName() + " make love with "
                    + anotherCat.getName());
            return new Cat("noname", 0, rn.nextBoolean(), rn.nextInt(20));
        }
        if ((this.isSex() == false) && (anotherCat.isSex() == false)){
            System.out.println(this.getName() + " say ha-ha");
        }
        if ((this.isSex() == true) && (anotherCat.isSex() == true)){
            System.out.println(this.getName() + " fight "
                    + anotherCat.getName());
        }
        return null;
    }

    public Cat beginFight(Cat anotherCat){
        if ((this.isSex() == true) && (anotherCat.isSex() == true) && (this.getFat() > anotherCat.getFat())){
            System.out.println(this.getName() + " fight "
                    + anotherCat.getName());
            System.out.println("The winner is: " + this.getName());
        } else if ((this.isSex() == true) && (anotherCat.isSex() == true) && (this.getFat() < anotherCat.getFat())){
            System.out.println(this.getName() + " fight "
                    + anotherCat.getName());
            System.out.println("The winner is: " + anotherCat.getName());
        } else {
            System.out.println("We do not fight");
        }
        return null;
    }
}
