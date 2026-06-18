public class mySeventhApp {
    public static void main(String[] args) {
        Person adam = new Person("Adam", "Nowak", 20, "Warsaw", 2006);

        System.out.println("original data");
        adam.displayInfo();

        System.out.println();
        adam.growOld(10);
        System.out.println("after growOld 10");
        adam.displayInfo();

        System.out.println();
        adam.beYounger();
        System.out.println("after beYounger");
        adam.displayInfo();
    }
}
