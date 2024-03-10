package src;


import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple");
        Fruit grapes = new Fruit("Grapes");
        Fruit peach = new Fruit("Peach");

        LinkedList<Fruit> groceries = new LinkedList<Fruit>(Arrays.asList(apple, grapes, peach));

        System.out.println(groceries);

        groceries.addFirst(new Fruit("Banana"));
        groceries.addLast(new Fruit("Blueberries"));

        System.out.println(groceries);
    }
}
