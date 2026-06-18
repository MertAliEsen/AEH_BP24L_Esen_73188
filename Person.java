public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    private int yearOfBirth;

    public Person(String name, String surname, int age, String address, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public void growOld(int years) {
        age += years;
    }

    public void beYounger() {
        age--;
    }

    public void displayInfo() {
        System.out.println("name " + name);
        System.out.println("surname " + surname);
        System.out.println("age " + age);
        System.out.println("adress " + address);
        System.out.println("year of birth " + yearOfBirth);
    }
}
