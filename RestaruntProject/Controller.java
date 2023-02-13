package RestaruntProject;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Controller {

    /*
    *  HashMap<Integer, MenuItem> menu = new HashMap<>();
    *  HashMap<Integer, Integer> orderedItems = new HAshMa();
    *  orderItems.keys() -> menu.get(it).multiple(orderItem.get(it2)
    * vector
    * enum vs final
    * abstract vs inteface
    *  */
    static void order(List<Menu> menus, int entryNumber) {
        Scanner sc = new Scanner(System.in);
        int entry = entryNumber;
        while (entry == 1) {
            int num = 0, rate = 0;
            String name = "";
            try {
                System.out.println("Enter number");
                num = sc.nextInt();
                sc.nextLine();
                for (Menu m : menus) {
                    if (m.getOrder() == num) {
                        throw new ArithmeticException("");
                    }
                }

            } catch (ArithmeticException e) {
                System.out.println("Order number already exist try another number");
                continue;
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Invalid input for number");
                sc.nextLine();
                continue;
            }

            try {
                System.out.println("Enter name");
                String pattern = "[a-zA-Z]+";
                name = sc.nextLine();
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(name);
                if (m.matches()) {
                    // System.out.println("Match found");
                } else {
                    throw new ArithmeticException("Error");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: Invalid user name.");
                continue;
            }

            try {
                System.out.println("Enter rate");
                rate = sc.nextInt();
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("Invalid input for rate");
                sc.nextLine();
                continue;
            }
            HashMap<Integer, Menu> menu = new HashMap<>();
            menu.put(num,(new Menu(num, name, rate)));
            for (Menu m : menus) {
                m.displayMenu();
            }
            System.out.println(menu);
            menu.forEach((key,value)-> System.out.println(value+" "));
            System.out.println("Press 1 to continue adding items to list or press 2 to order food");
            try {
                entry = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for entry");
                sc.nextLine();
                continue;
            }


        }
        int i = 1, total = 0, c = 0, t = 0;
        while (entry == 2) {
            while (i >= 1) {
                for (Menu m : menus) {
                    m.displayMenu();
                }
                if (c == 0) {
                    System.out.println("Enter your Item number=>");
                    c++;
                } else {
                    System.out.println("Add more to your order list press your Item number");
                    System.out.println("Place a order press 0");
                    try {
                    } catch (InputMismatchException e) {
                        System.out.println("Enter only number");
                        // continue;
                    }

                }

                try {
                    int cc = 0;
                    i = sc.nextInt();
                    //  System.out.println(i);
                    for (Menu m : menus) {
                        if (m.getOrder() == i) {
                            Ordering order = new Ordering(i);
                            total = order.amount(menus);
                            t += total;
                            System.out.println("current Total amount => " + t);
                        } else {
                            cc++;
                        }
                    }
                    if (cc == menus.size()) {
                        throw new ArithmeticException("error");
                    }

                } catch (ArithmeticException e) {
                    c--;
                    if (i == 0) {

                    } else {
                        System.out.println("Enter number only in the list of order");
                    }

                } catch (InputMismatchException e) {
                    c--;
                    System.out.println("Invalid input. Please enter an Number.");
                    sc.nextLine();
                }

            }
            System.out.println("Your order is preparing please wait  Total amount = " + t);
            break;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(new Menu(1, "Biriyani", 100));
        menus.add(new Menu(2, "Chicken", 80));
        menus.add(new Menu(3, "Egg", 40));
        menus.add(new Menu(4, "Porotta", 45));
        menus.add(new Menu(5, "Mutton", 170));


        while (true) {
            //  System.out.print("Enter an integer: ");
            try {
                System.out.println("For Admin press 1 (or) For order press 2");
                int entryNumber = sc.nextInt();
                order(menus, entryNumber);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }

        }


    }
}
