package javaobjectpractice;

public class App {
    public static void main(String[] args){

        Mobile android = new Android("S8", "RED", "SAMSUNG");
        Mobile iphone = new IPhone("7", "WHITE", "APPLE");

        Person person = new Person("Tommy");

        IPhoneRobot iPhoneRobot = new IPhoneRobot("good bot");

        android.call("hi all");
        android.call("Please fork the following repository and complete the following stories.");
        iphone.call("hi");
        iphone.call("Please fork the following repository and complete the following stories.");
        iphone.call("Please fork the following repository and complete the following stories. Please submit the address of your Github repository to the answer field.");


        person.setMobile(android);
        person.call("hi, let see...");

        iPhoneRobot.setIPhone((IPhone)iphone);
        iPhoneRobot.call("i am bot");


    }
}
