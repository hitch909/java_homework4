
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        int num = 123;
        Deque<Integer> mydDeque = new ArrayDeque<>(creatureQueue());
        System.out.println("начальная очередь: " + mydDeque);
        System.out.println(" помещает элемент в конец очереди" + enqueue(mydDeque, num));
        System.out.println("возвращает первый элемент из очереди и удаляет его" + dequeue(mydDeque));
        System.out.println(mydDeque);
        System.out.println(" возвращает первый элемент из очереди, не удаляя" + first(mydDeque));
        System.out.println(mydDeque);
    }

    public static Deque<Integer> enqueue(Deque<Integer> mydQueue, int num) {// помещает элемент в конец очереди
        mydQueue.addLast(num);
        return mydQueue;
    }

    public static int dequeue(Deque<Integer> mydQueue) { // возвращает первый элемент из очереди и удаляет его
        return mydQueue.pop();
    }

    public static int first(Deque<Integer> mydQueue) { // возвращает первый элемент из очереди, не удаляя
        return mydQueue.getFirst();
    }

    public static Queue<Integer> creatureQueue() {
        Queue<Integer> myTempQueue = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            myTempQueue.add(a);
        }
        return myTempQueue;
    }
}
