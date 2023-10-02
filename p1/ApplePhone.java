package p1;

public class ApplePhone extends Phone {
    public ApplePhone(String number, String model, int weigth) {
        super(number, model, weigth);
    }
    @Override
    public void Info() {
        System.out.printf("number: %s \n model: %s \n weith: %d \n--------\n", getNumber(), model, weigth);
    }
}
