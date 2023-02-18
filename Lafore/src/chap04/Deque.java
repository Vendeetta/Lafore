package chap04;

import java.util.Arrays;

public class Deque {
    private int maxSize;
    private int[] elems;
    private int start;
    private int end;
    private int nElems;

    public Deque(int maxSize) {
        this.maxSize = maxSize;
        elems = new int[maxSize];
        start = 0;
        end = -1;
        nElems = 0;
    }

    public void insertRight(int number) {
        if (isFull())
            throw new IllegalArgumentException("Очередь заполнена!");
        if (end == maxSize - 1)
            end = -1;
        elems[++end] = number;
        nElems++;
    }

    public void insertLeft(int number) {
        if (isFull())
            throw new IllegalArgumentException("Очередь заполнена!");
        if (start == 0)
            start = maxSize;
        elems[--start] = number;
        nElems++;
    }

    public int removeLeft() {
        if (isEmpty())
            throw new IllegalArgumentException("Очередь пуста!");
        int tmp = elems[start++];
        if (start == maxSize)
            start = 0;
        nElems--;
        return tmp;
    }

    public int removeRight() {
        if (isEmpty())
            throw new IllegalArgumentException("Очередь пуста!");
        if (end < 0) {
            end = maxSize-1;
        }
        int tmp = elems[end--];
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
        Deque deq = new Deque(5);
//        deq.insertLeft(1);
        deq.insertRight(2);
//        deq.insertLeft(3);
        deq.insertRight(4);
        System.out.println(deq);
//        System.out.println(deq.removeLeft());
//        System.out.println(deq.removeLeft());
        System.out.println(deq.removeRight());
        System.out.println(deq.removeRight());
        System.out.println(deq.isEmpty());
        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertRight(4);
        deq.insertRight(5);
        System.out.println(deq);
        System.out.println(deq.isFull());
        System.out.print(deq.removeLeft() + " ");
        System.out.print(deq.removeLeft() + " ");
        System.out.print(deq.removeLeft() + " ");
        System.out.print(deq.removeLeft() + " ");
        System.out.print(deq.removeLeft() + " ");


    }
}
