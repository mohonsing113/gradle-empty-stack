public class Bus extends Vehicle {
    public Bus(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void speedUp(int increase) {
        if (increase > 80) {
            System.out.println(name + " is a " + brand + " car and it broke due to speed up to:" + increase);
        } else {
            super.speedUp(increase);
        }
    }
}
