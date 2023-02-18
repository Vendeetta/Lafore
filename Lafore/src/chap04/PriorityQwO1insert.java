package chap04;

import java.io.IOException;

public class PriorityQwO1insert {
    // priorityQ.java
// Работа с приоритетной очередью
// Запуск программы: C>java PriorityQApp
////////////////////////////////////////////////////////////////
        // Элементы массива сортируются по значению ключа,
// от максимумa (0) до минимума (maxSize-1)

        private int maxSize;
        private long[] queArray;
        private int nItems;
        //-------------------------------------------------------------
        public PriorityQwO1insert(int s)
// Конструктор
        {
            maxSize = s;
            queArray = new long[maxSize];
            nItems = 0;
        }
        public void insert(long item)
        {
                queArray[nItems++] = item;
            }
        //
        //-------------------------------------------------------------
        public long remove() {
        long res = Long.MAX_VALUE;
        int j = 0;
            for (int i = 0; i < nItems; i++) {
                if (queArray[i] < res) {
                    res = queArray[i];
                    j = i;
                }
            }
            for (int i = j; i < nItems; i++) {
                if (i == queArray.length - 1){
                    queArray[i] = 0;
                } else {
                    queArray[i] = queArray[i + 1];
                }
            }
            nItems--;
         return res; }
        //-------------------------------------------------------------
        public long peekMin()
// Чтение минимального элемента
        { return queArray[nItems-1]; }
        //-------------------------------------------------------------
        public boolean isEmpty()
// true, если очередь пуста
        { return (nItems==0); }
        //-------------------------------------------------------------
        public boolean isFull()
// true, если очередь заполнена
        { return (nItems == maxSize); }
    public void print(){
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
    }
//-------------------------------------------------------------
    } // Конец класса PriorityQ
    ////////////////////////////////////////////////////////////////
    class PriorityQApp
    {
        public static void main(String[] args) throws IOException
        {
            PriorityQwO1insert thePQ = new PriorityQwO1insert(5);
            thePQ.insert(30);
            thePQ.insert(50);
            thePQ.insert(10);
            thePQ.insert(40);
            thePQ.insert(20);
            thePQ.print();
//            while( !thePQ.isEmpty() )
//            {
//                long item = thePQ.remove();
//                System.out.println(item + " ");
//                thePQ.print();
//            }
                System.out.println(thePQ.remove());
                System.out.println(thePQ.remove());
                thePQ.print();
                thePQ.insert(100);
                thePQ.print();
                thePQ.insert(1);
                thePQ.print();
            System.out.println(thePQ.remove());
            System.out.println(thePQ.remove());
            System.out.println(thePQ.remove());
            System.out.println(thePQ.remove());
            System.out.println(thePQ.remove());

// 10, 20, 30, 40, 50
            System.out.println("");

        }
//-------------------------------------------------------------
    } // Конец класса PriorityQApp
