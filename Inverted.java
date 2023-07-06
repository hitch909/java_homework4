
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
// который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Inverted {
    public static void main(String[] args) {
        int numB = newRandomNumber();
        LinkedList<Integer> myNextList = new LinkedList<>(invertedList(numB));
        System.out.println("\nИсходный массив: " + myNextList);
        Collections.reverse(myNextList);
        System.out.print("Перевенутый массив: " + myNextList);
    }

    public static LinkedList<Integer> invertedList(int numB) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myList.add(newRandomNumber());
        }
        return myList;
    }

    public static int newRandomNumber() {
        double x = (Math.random() * 99);
        return (int) x;
    }
}
