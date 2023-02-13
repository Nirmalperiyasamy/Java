package RestaruntProject;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ordering {
    String name;
    int order;

    Ordering(int order){

       this.order =order;

    }

    Scanner sc = new Scanner(System.in);
    public int amount (List<Menu> menu
    ){
        int sum=0;
       for (Menu m:menu){
           if (m.getOrder()==order){
               System.out.println("Enter Quantity");
               while (true){
                   try{
                       int quantity=sc.nextInt();
                       sum+=m.getRate()*quantity;
                       return sum;
                   }
                   catch (InputMismatchException e){
                       System.out.println("Invalid input. Please enter an Number in Quantity.");
                       sc.nextLine();
                   }
               }
           }
       }
       return sum;
    }
}
