package prog.oop.Lessons_2.Phones;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize, countCall, countSMS;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        countCall++;
        System.out.println("Phone class is calling " + number + " Quantity of calls is " + countCall);
    }

    public void sendSMS(String number, String message){
        countSMS++;
        System.out.println("Phone class is sending sms " + message + " to " + number + " Quantity of SMS is " + countSMS);
    }
}
