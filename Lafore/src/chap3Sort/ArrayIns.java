package chap3Sort;

public class ArrayIns {

    private long[] a;
    private int nElems;

    // Количество элементов данных
//--------------------------------------------------------------
    public ArrayIns(int max)
// Конструктор
    {
        a = new long[max];
// Создание массива
        nElems = 0;
// Пока нет ни одного элемента
    }

    //--------------------------------------------------------------
    public void insert(long value)
// Вставка элемента в массив
    {
        a[nElems] = value;
// Собственно вставка
        nElems++;
// Увеличение размера
    }

    //--------------------------------------------------------------
    public void display()
// Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++)
// Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }

    public void median() {
        insertionSort();
        System.out.println("Median is in index = " + ((nElems) / 2) + ". Key is - " + a[nElems / 2]);
    }

    public void noDups() {
        insertionSort();
        int count = 0;
            int i = 0;
            for ( int j = 1; j < nElems; ++j ) {
                if (a[j] != a[i]) {
                    a[++i] = a[j];
                } else {
                    count++;
                }
                a[j] = 0;
            }
            nElems -=count;
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++)
// out - разделительный маркер
        {
            long temp = a[out];
// Скопировать помеченный элемент
            in = out;
// Начать перемещения с out
            while (in > 0 && a[in - 1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in - 1];
// Сдвинуть элемент вправо
                --in;
// Перейти на одну позицию влево
            }
            a[in] = temp;
// Вставить помеченный элемент
        }
    }
//--------------------------------------------------------------
} // Конец класса ArrayIns

////////////////////////////////////////////////////////////////
class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
// Размер массива
        ArrayIns arr;
// Ссылка на массив
        arr = new ArrayIns(maxSize); // Создание массива
        arr.insert(77);
        arr.insert(77);
// Вставка 10 элементов
        arr.insert(99);
//        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(11);
        arr.insert(11);
        arr.insert(33);
        arr.display();// Вывод элементов
        arr.insertionSort();// Сортировка методом вставки
        arr.display();
        arr.noDups();
        arr.display();
    }// Повторный вывод
}

