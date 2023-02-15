package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExampleIterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)) ;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);

        List<Integer> number1 = new ArrayList() ;
        number1.add(4);
        number1.add(5);
        number1.add(3);
        number1.add(41);
        number1.add(2);

        for (int i = 0; i < number1.size(); i++) {
            if(number1.get(i)%2==0){
                number1.remove(number1);
            }
        }
        System.out.println(number1);
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        for (String fruit : myList) {
            if (fruit.equals("banana")) {
                myList.remove(fruit); // This will throw a ConcurrentModificationException
            }
        }
        System.out.println(myList);
    }


}
