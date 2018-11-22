public class Vehicle {
    String name;
    String brand;

    public Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public void speedUp(int increase){
        System.out.println(name+" is a "+brand+" and speed up to:"+increase);
    }
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle("car1", "audi");
        Vehicle vehicle2 = new Vehicle("car2", "benz");

        vehicle1.speedUp(30);
        vehicle2.speedUp(40);
    }
}
