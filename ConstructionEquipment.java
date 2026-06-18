public class ConstructionEquipment extends Vehicle {
    private double hours;

    public ConstructionEquipment(String regNo, String vin, String color, double price, double fuelUse, double fuel, double km, FuelType type, double hours) {
        super(regNo, vin, color, price, fuelUse, fuel, km, type);
        this.hours = hours;
    }

    public void displayInfo() {
        System.out.println("construction equipment");
        super.displayInfo();
        System.out.println("hours worked " + hours);
    }
}
