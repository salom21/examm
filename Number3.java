package DSA;

import java.util.EmptyStackException;

public class Number3 {
    private int[] stack1;
    private int[] stack2;
    private int top1;
    private int top2;

    public Number3(int capacity) {
        stack1 = new int[capacity];
        stack2 = new int[capacity];
        top1 = -1;
        top2 = -1;
    }

    public void enqueue(int element) {
        if (top1 == stack1.length - 1) {
            System.out.println("Queue is full. Cannot enqueue element: " + element);
            return;
        }
        
        stack1[++top1] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }

        return stack2[top2--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }

        return stack2[top2];
    }

    public boolean isEmpty() {
        return top1 == -1 && top2 == -1;
    }

    public static void main(String[] args) {
        Number3 queue = new Number3(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Peeked element: " + queue.peek());

        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

        
    }
}
