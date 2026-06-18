public class Motorcycle extends Vehicle {
    private boolean sidecar;

    public Motorcycle(String regNo, String vin, String color, double price, double fuelUse, double fuel, double km, FuelType type, boolean sidecar) {
        super(regNo, vin, color, price, fuelUse, fuel, km, type);
        this.sidecar = sidecar;
    }

    public void displayInfo() {
        System.out.println("motorcycle");
        super.displayInfo();
        System.out.println("has sidecar " + sidecar);
    }
}
