package workout;

import workout.Display;
 class Shape {
    public  final int CIRCLE = 0;
    public  final int SQUARE = 1;
    public  final int TRIANGLE = 2;
    static  int name=99;
}
enum Color {
    RED,
    GREEN,
    BLUE
}
public class workout  {
    public static void main(String[] args) {
        Color colo=Color.BLUE;
        Shape sh =new Shape();
        System.out.println(sh.TRIANGLE);
       // int shape = Shape.Triangle;
       // System.out.println(shape);
        System.out.println(colo);
    }

}
