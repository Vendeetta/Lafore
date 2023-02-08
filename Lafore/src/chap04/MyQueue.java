package chap04;

import java.util.Arrays;
import java.util.Queue;

public class MyQueue {
    private int maxSize;
    private int[] elems;
    private int start;
    private int end;
    private int nElems;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        elems = new int[maxSize];
        start = 0;
        end = -1;
        nElems = 0;
    }

    public void insert(int Number) {
        if (isFull())
            throw new IllegalArgumentException("Очередь заполнена!");
        if (end == maxSize - 1)
            end = -1;
        elems[++end] = Number;
        nElems++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalArgumentException("Очередь пуста!");
        int tmp = elems[start++];
        if (start == maxSize)
            start = 0;
        nElems--;
        return tmp;
    }

    public int peek() {
        return elems[start];
    }

    public int size() {
        return nElems;
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public boolean isFull() {
        return nElems == maxSize;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "elems=" + Arrays.toString(elems) +
                '}';
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.remove();
        queue.remove();
        System.out.println(queue.size());
        queue.insert(6);
        queue.insert(7);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.elems[queue.end]);
    }

}
