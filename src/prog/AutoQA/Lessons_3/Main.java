package prog.AutoQA.Lessons_3;

public class Main {
    public static void main(String[] args) {
        Cat myLittleCat;
        Cat barsik = new Cat("Barsik", 2, true, 20);
        Cat murzik = new Cat("Muzik", 6, true, 15);
        Cat murka = new Cat("Murka", 3, false, 14);
        Cat maruska = new Cat("Maruska", 3, false, 16);
        Cat myAnotherLittleCat = murka.makeLove(murzik);
        System.out.println("Another cat created: " + myAnotherLittleCat.isSex());
        murka.makeLove(maruska);
        barsik.makeLove(murzik);
        myLittleCat = barsik.makeLove(murka);
        System.out.println("New cat created : " + myLittleCat.getName()
                + " " + myLittleCat.getAge() + " " + myLittleCat.isSex());
        myLittleCat.name = "Vaska";
        System.out.println("Cat edited : " + myLittleCat.getName()
                + " " + myLittleCat.getAge() + " " + myLittleCat.isSex());

        barsik.beginFight(murzik);
    }
}