package javaobjectpractice;

public class Android extends Mobile {

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if(message.length()>40){
            message = "Message cannot be sent";
        }
        System.out.print("<Android>");
        super.call(message);
    }
}
