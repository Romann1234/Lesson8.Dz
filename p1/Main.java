package p1;

public class Main {
    public static void main(String[] args) {
        Phone Phone1 = new ApplePhone("89095673554", "iphone15",171  );
        Phone1.receiveCall("Vasya");
        Phone1.Info();

        Phone Phone2 = new XiaomiPhone("89125463654","Xiaomi 12",160 );
        Phone2.receiveCall("Bogdan");
        Phone2.Info();

        Phone Phone3 = new SamsungPhone("89505674348","Galaxy S22",167);
        Phone3.receiveCall("Ivan");

        Phone3.Info();






    }

}