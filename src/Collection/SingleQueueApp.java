package Collection;

import Collection.Abstract.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("Saiful"));
        System.out.println(queue.offer("Amin"));
        System.out.println(queue.offer("Rizki"));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
