package RestaruntProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        ArrayList<Menu> menus =new ArrayList<Menu>();
        menus.add(new Menu(1,"Biriyani",100));
        menus.add(new Menu(2,"Chicken",80));
        menus.add(new Menu(3,"Egg",40));
        menus.add(new Menu(4,"Porotta",45));
        menus.add(new Menu(5,"Mutton",170));
        for (Menu m :menus){
            m.displayMenu();
        }
        Scanner sc = new Scanner(System.in);
        int i=1,total=0,c=0,t=0;
        while (i>=1){
            if(c==0){
                System.out.println("Enter your Item number=>");
                c++;
            }
            else {
                System.out.println("Add more to your order list press your Item number");
                System.out.println("Place a order press 0");
            }


                try {
                    i = sc.nextInt();
                    if(i>0 && i<6){
                        Ordering order = new Ordering(i);
                        total=order.amount(menus);
                        t+=total;
                        System.out.println("current Total amount => "+t);
                    }
                    else {
                        c--;
                        System.out.println("Enter number only in the list of order");

                    }
                    // do something with intValue
                } catch (InputMismatchException e) {
                     c--;
                    System.out.println("Invalid input. Please enter an Number.");
                    sc.nextLine();
                }



        }
        System.out.println("Your order is preparing please wait  Total amount = "+t);
    }
}
