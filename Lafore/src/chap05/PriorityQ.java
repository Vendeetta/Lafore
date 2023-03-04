package chap05;

import java.io.IOException;

public class PriorityQ {
    // priorityQ.java
// Работа с приоритетной очередью
// Запуск программы: C>java PriorityQApp
////////////////////////////////////////////////////////////////
    // Элементы массива сортируются по значению ключа,
// от максимумa (0) до минимума (maxSize-1)
    private SortedLinkList list;

    public PriorityQ() {
        list = new SortedLinkList();
    }

    public void insert(int item) {
        list.insert(item, 1.0);
    }
    public boolean isEmpty()
// true, если очередь пуста
    {
        return list.isEmpty();
    }

    public int peek() {
        return list.delete().iData;
    }

    public void print() {
        list.displayList();
    }

    //-------------------------------------------------------------------------------------------
} // Конец класса PriorityQ

////////////////////////////////////////////////////////////////
class PriorityQApp {
    public static void main(String[] args) throws IOException {
        PriorityQ thePQ = new PriorityQ();
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        thePQ.print();
        System.out.println(thePQ.peek());
        System.out.println(thePQ.peek());
        thePQ.print();


    }
//-------------------------------------------------------------
} // Конец класса PriorityQApp
