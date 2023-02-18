package chap04;

public class Queue {
    // queue.java
// Работа с очередью
// Запуск программы: C>java QueueApp
////////////////////////////////////////////////////////////////
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //--------------------------------------------------------------
    public Queue(int s)
// Конструктор
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //--------------------------------------------------------------
    public void insert(long j)
// Вставка элемента в конец очереди
    {
        if (rear == maxSize - 1)
// Циклический перенос
            rear = -1;
        queArray[++rear] = j;
// Увеличение rear и вставка
        nItems++;
// Увеличение количества элементов
    }

    //--------------------------------------------------------------
    public long remove()
// Извлечение элемента в начале очереди
    {
        long temp = queArray[front++]; // Выборка и увеличение front
        if (front == maxSize)
// Циклический перенос
            front = 0;
        nItems--;
// Уменьшение количества элементов
        return temp;
    }

    //--------------------------------------------------------------
    public long peekFront()
// Чтение элемента в начале очереди
    {
        return queArray[front];
    }

    //--------------------------------------------------------------
    public boolean isEmpty()
// true, если очередь пуста
    {
        return (nItems == 0);
    }

    //--------------------------------------------------------------
    public boolean isFull()
// true, если очередь заполненаОчереди  
    {
        return (nItems == maxSize);
    }

    //--------------------------------------------------------------
    public int size()
// Количество элементов в очереди
    {
        return nItems;
    }

    public void printQ () {
        int index = front;
        int count = 0;
        System.out.println(nItems);
        while (count < nItems) {
            if (index == maxSize) {
                index = 0;
            }
            System.out.print(queArray[index++] + " ");
            count++;
        }
    }
//--------------------------------------------------------------
} // Конец класса Queue

////////////////////////////////////////////////////////////////
class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5); // Очередь из 5 ячеек

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);// Вставка 4 элементов
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();// Извлечение 3 элементов
//

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);// Вставка еще 4 элементов
//
        while (!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        System.out.println(theQueue.size());
        theQueue.printQ();
        theQueue.remove();
        System.out.println("");
        theQueue.printQ();
//        System.out.println("");
//        theQueue.remove();
//        theQueue.remove();
//        theQueue.remove();
//        theQueue.remove();
//        theQueue.printQ();
    }
// Конец класса QueueApp
}
