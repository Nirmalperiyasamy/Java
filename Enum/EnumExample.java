package Enum;

enum Direction {
    NORTH(1),
    EAST(2),
    SOUTH(3),
    WEST(4);

    private int direction;

    Direction(int direction) {
        this.direction = direction;
    }
}
class finalKeyword{
     public static final int NORTH = 0;
    public static final int EAST = 10;
    public static final int SOUTH = 2;
    public static final int WEST = 3;
}

public class EnumExample extends finalKeyword{
    public static void main(String[] args) {

        Direction direction1 = Direction.SOUTH;
        // String north=
        System.out.println(direction1);
        int direction = Direction.SOUTH.ordinal();
        System.out.println("Direction using enum: " + direction);
        //  direction = NORTH;
        System.out.println("Direction using public static final: " + direction);
        int direction2 = EAST;
        System.out.println(direction2);
        System.out.println(WEST);
        Laptop lap = Laptop.HP;
        System.out.println(lap);

    }
}


