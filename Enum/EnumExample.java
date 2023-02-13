package Enum;

enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
}

public class EnumExample {

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    public static void main(String[] args) {
        Direction direction1 = Direction.SOUTH;
        System.out.println(direction1);
        int direction = Direction.NORTH.ordinal();
        System.out.println("Direction using enum: " + direction);
        direction = NORTH;
        System.out.println("Direction using public static final: " + direction);
        int direction2 = EAST;
        System.out.println(direction2);
        System.out.println(WEST);
       // Direction.WEST=9;
         //EAST=7;
    }
}


