public abstract class Vehicle {
    private String regNo;
    private String vin;
    private String color;
    private double price;
    private double fuelUse;
    private double fuel;
    private double km;
    private FuelType type;

    public Vehicle(String regNo, String vin, String color, double price, double fuelUse, double fuel, double km, FuelType type) {
        this.regNo = regNo;
        this.vin = vin;
        this.color = color;
        this.price = price;
        this.fuelUse = fuelUse;
        this.fuel = fuel;
        this.km = km;
        this.type = type;
    }

    public void drive(double distance) {
        double used = distance * fuelUse / 100;

        if (used <= fuel) {
            km += distance;
            fuel -= used;
            System.out.println(regNo + " drove " + distance + " km");
        } else {
            System.out.println(regNo + " doesnt have enough fuel for " + distance + " km");
        }
    }

    public void refuel(double amount) {
        fuel += amount;
        System.out.println(regNo + " refueled by " + amount);
    }

    public void displayInfo() {
        System.out.println("registration " + regNo);
        System.out.println("vin " + vin);
        System.out.println("color " + color);
        System.out.println("price " + price);
        System.out.println("fuel use " + fuelUse);
        System.out.println("fuel level " + fuel);
        System.out.println("milage " + km);
        System.out.println("fuel type " + type.getFuelType());
    }
}
