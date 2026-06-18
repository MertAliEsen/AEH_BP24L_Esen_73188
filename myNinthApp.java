public class myNinthApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(1, 5000, "Tom", "tom@mail.com", "12345");

        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        System.out.println();
        warehouse.updateContact("tom2@mail.com", "54321");
        warehouse.addGoods(1000);
    }
}
