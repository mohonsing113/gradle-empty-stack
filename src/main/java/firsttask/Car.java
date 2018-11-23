package firsttask;

public class Car extends Vehicle {
    public Car(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void speedUp(int increase) {
        if (increase > 200) {
            System.out.println(name + " is a " + brand + " car and it broke due to speed up to:" + increase);
        } else {
            super.speedUp(increase);
        }
    }
}
