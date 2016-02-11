package prog.oop.Lessons_2.Phones;

/*      Написать код для связи телефонов между собой. У
        каждого телефона будет свой номер. При вызове
        call(x) телефон должен найти собеседника по
        номеру x из всех доступных в данный момент
        телефонов )из всех созданных объектов типа
        Phone) и вызвать его метод answer().*/

public class PhonesContact {

    String ownNumber;

    public PhonesContact(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void Answer()  {
        System.out.println("Answer");
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void Call(PhonesContact phones[], String toNumber) {


        if (ownNumber.equals(toNumber))
            System.out.println("You are calling to your number. Please change number" );
        else

            for (int i = 0; i < phones.length; i++ )

                if (phones[i].getOwnNumber().equals(toNumber) ){
                    System.out.println("Phone "+ ownNumber +" is calling to Phone " + toNumber);
                    phones[i].Answer();
                }


    }

    public static void main(String[] args) {
        PhonesContact [] phones ={
                new PhonesContact("0500000000"),
                new PhonesContact("0661111111"),
                new PhonesContact("0952222222"),
                new PhonesContact("0933333333")};

        phones[0].Call(phones, "0661111111");
        phones[2].Call(phones, "0952222222");
    }
}
