package Enum;

enum Laptop {
    DELL(1000), HP(1500), ASUS, SAMSUNG(500);
    private final int price;

    private Laptop() {
        price = 10;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

public class AnotherExample {


    public static void main(String[] args) {
        Laptop lap = Laptop.HP;
        System.out.println(lap.name());
        Laptop asus = Laptop.ASUS;
        System.out.println(asus.getPrice());
      //  asus.setPrice(9999);
        System.out.println(asus.getPrice());
        String asusString = asus.toString();
        System.out.println(asusString);
        Laptop samsung = Laptop.SAMSUNG;
      //  samsung.setPrice(70099);
        System.out.println(samsung.getPrice());
        if (asusString.equals(asus.name())) {
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }
        Laptop[] lapArray = Laptop.values();
        for (Laptop laptop : lapArray) {
            System.out.println(laptop.name() + " " + laptop.getPrice());
        }
    }
}
