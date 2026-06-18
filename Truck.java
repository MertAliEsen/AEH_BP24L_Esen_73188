public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(String regNo, String vin, String color, double price, double fuelUse, double fuel, double km, FuelType type, double maxLoad) {
        super(regNo, vin, color, price, fuelUse, fuel, km, type);
        this.maxLoad = maxLoad;
    }

    public void displayInfo() {
        System.out.println("truck");
        super.displayInfo();
        System.out.println("max load " + maxLoad);
    }
}
