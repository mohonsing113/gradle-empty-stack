package javaobjectpractice;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(String message){
        System.out.println("Message : " + message);
    }

    public void printBasicInfomation(){
        System.out.print(String.format("name: %s, color: %s, brand: %s", name, color, brand));
    }
}
