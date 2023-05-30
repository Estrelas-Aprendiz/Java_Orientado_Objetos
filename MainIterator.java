package Interator;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Cria e instancia o Interator
        Iterator<Integer> iterate = numbers.iterator();

        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        iterate.next();

        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: " +numbers);

        while(iterate.hasNext()) {
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
