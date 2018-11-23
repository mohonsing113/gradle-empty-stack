package javaobjectpractice;

public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message){
        if(message.length()>103){
            message = "Message cannot be sent";
        }
        System.out.print("<iPhone>");
        super.call(message);
    }
}
