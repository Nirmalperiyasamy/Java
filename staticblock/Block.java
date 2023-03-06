package staticblock;

class Demo{
    static {
        System.out.println("demo");
    }
}

public class Block  {
    static {
        System.out.println("BLock");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("Mainmethod");
    }
}
