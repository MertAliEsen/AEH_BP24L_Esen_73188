public class PassengerCar extends Vehicle {
    private int doors;

    public PassengerCar(String regNo, String vin, String color, double price, double fuelUse, double fuel, double km, FuelType type, int doors) {
        super(regNo, vin, color, price, fuelUse, fuel, km, type);
        this.doors = doors;
    }

    public void displayInfo() {
        System.out.println("passenger car");
        super.displayInfo();
        System.out.println("doors " + doors);
    }
}
