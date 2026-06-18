public class Warehouse {
    private int number;
    private int totalSpace;
    private int freeSpace;
    private String owner;
    private String email;
    private String phone;

    public Warehouse(int number, int total, String owner, String email, String phone) {
        this.number = number;
        totalSpace = total;
        freeSpace = total;
        this.owner = owner;
        this.email = email;
        this.phone = phone;
    }

    public int getWarehouseNumber() { return number; }
    public void setWarehouseNumber(int number) { this.number = number; }

    public int getTotalWarehouseSpace() { return totalSpace; }
    public void setTotalWarehouseSpace(int total) { totalSpace = total; }

    public int getAvailableWarehouseSpace() { return freeSpace; }
    public void setAvailableWarehouseSpace(int free) { freeSpace = free; }

    public String getOwnerName() { return owner; }
    public void setOwnerName(String owner) { this.owner = owner; }

    public String getOwnerEmail() { return email; }
    public void setOwnerEmail(String email) { this.email = email; }

    public String getOwnerPhoneNumber() { return phone; }
    public void setOwnerPhoneNumber(String phone) { this.phone = phone; }

    public void addGoods(int amount) {
        if (amount <= freeSpace) {
            freeSpace -= amount;
            System.out.println("added " + amount + " units free space " + freeSpace);
        } else {
            System.out.println("not enough space free space " + freeSpace);
        }
    }

    public void removeGoods(int amount) {
        int used = totalSpace - freeSpace;

        if (amount <= used) {
            freeSpace += amount;
            System.out.println("removed " + amount + " units free space " + freeSpace);
        } else {
            System.out.println("cant remove more goods than stored");
        }
    }

    public void checkOccupancy() {
        int used = totalSpace - freeSpace;
        System.out.println("ocupied space " + used);
        System.out.println("free space " + freeSpace);
    }

    public void updateContact(String email, String phone) {
        this.email = email;
        this.phone = phone;
        System.out.println("owner contact updated");
        System.out.println("new email " + email);
        System.out.println("new phone " + phone);
    }
}
