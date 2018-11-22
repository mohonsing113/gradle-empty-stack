public class Driver {
    Vehicle vehicle;
    String name;

    public Driver(Vehicle vehicle, String name) {
        this.vehicle = vehicle;
        this.name = name;
    }
    public void speedUp(int increase) {
        vehicle.speedUp(increase);
    }

}
