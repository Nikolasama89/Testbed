package gr.aueb.cf.ch19.deq_queue;

import gr.aueb.cf.ch19.deq_stack.MyStack;

public class DeqMain {


    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();

        strQueue.enQueue("ABC188234");
        strQueue.enQueue("ABC12f3314");
        strQueue.enQueue("ABC12234");

        String firstOut = strQueue.deQueue();
        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);

    }
}
