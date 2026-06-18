public class RentalTest {
    public static void main(String[] args) {
        FuelType diesel = new DieselEngine();
        FuelType gasoline = new GasolineEngine();
        FuelType electric = new ElectricEngine();

        PassengerCar car = new PassengerCar("A1", "1", "black", 100, 6, 40, 1000, gasoline, 4);
        Truck truck = new Truck("B2", "2", "white", 200, 15, 80, 2000, diesel, 10000);
        Motorcycle motorcycle = new Motorcycle("C3", "3", "red", 50, 4, 15, 500, gasoline, false);
        ConstructionEquipment excavator = new ConstructionEquipment("D4", "4", "yellow", 300, 20, 100, 800, diesel, 1000);
        PassengerCar electricCar = new PassengerCar("E5", "5", "blue", 150, 10, 70, 600, electric, 4);

        car.displayInfo();
        car.drive(100);
        car.refuel(10);

        System.out.println();
        truck.displayInfo();
        truck.drive(200);

        System.out.println();
        motorcycle.displayInfo();
        motorcycle.drive(50);

        System.out.println();
        excavator.displayInfo();
        excavator.refuel(25);

        System.out.println();
        electricCar.displayInfo();
        electricCar.drive(80);
    }
}
