package javaobjectpractice;

public class IPhoneRobot {
    String name;
    IPhone iPhone;

    public IPhoneRobot(String name) {
        this.name = name;
    }

    public void setIPhone(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public void call(String message){
        iPhone.call(message);

    }
}
