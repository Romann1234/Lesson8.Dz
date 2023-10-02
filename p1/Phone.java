package p1;

public abstract class  Phone {
    private String number;
    String model;
    int weigth;

    public String getNumber() {
        return  number;

    }

    public void setNumber(String number) {
        this.number=number;
    }


    public Phone(String number, String model, int weigth) {
        this.number = number;
        this.model = model;
        this.weigth = weigth;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public abstract void Info();

    public void receiveCall(String name) {

        System.out.printf("Zvonit: %s \n", name );


    }
}





