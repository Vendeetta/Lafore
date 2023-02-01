package chap02;

public class OrdArray {

    private long[] a;
    // Ссылка на массив a
    private int nElems;

    // Количество элементов данных
//-----------------------------------------------------------
    public OrdArray(int max)
// Конструктор
    {
        a = new long[max];
// Создание массива
        nElems = 0;
    }

    //-----------------------------------------------------------
    public int size() {
        return nElems;
    }

    //-----------------------------------------------------------
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
// Элемент найден
            else if (lowerBound > upperBound)
                return lowerBound;
// Элемент не найден
            else
// Деление диапазона
            {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
    }

    //-----------------------------------------------------------
    public void insert(long value)
// Вставка элемента в массив
    {
        int j = find(value);
//        for (j = 0; j < nElems; j++)
//// Определение позиции вставки
//            if (a[j] > value)
// (линейный поиск)
//                break;
        for (int k = nElems; k > j; k--)
// Перемещение последующих элементов
            a[k] = a[k - 1];
        a[j] = value;
// Вставка
        nElems++;
// Увеличение размера
    }

    //-----------------------------------------------------------
    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems)
// Найти не удалось
            return false;
        else
// Элемент найден
        {
            for (int k = j; k < nElems; k++) // Перемещение последующих элементов
                a[k] = a[k + 1];
            nElems--;
// Уменьшение размераРеализация упорядоченного массива на языке Java  
            return true;
        }
    }
    public boolean delete (int index){
        if(index >= nElems) return false;
        for (int k = index; k < nElems; k++) // Перемещение последующих элементов
            a[k] = a[k + 1];
        nElems--;
// Уменьшение размераРеализация упорядоченного массива на языке Java  
        return true;
    }

    //-----------------------------------------------------------
    public void display()
// Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++)
// Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println("");
    }

    public long get(int index) {
        if (index >= nElems) return -1;
        return a[index];
    }

    public long getAndRemove() {
        if (nElems > 0) {
            long res = a[0];
            delete(res);
            return res;
        }
        return -1;
    }

    public void merge(OrdArray arr) {
        long[] tmp = new long[nElems];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = a[i];
        }
        a = new long[nElems + arr.size() + 5];
        nElems = 0;
        for (int i = 0; i < tmp.length; i++) {
            insert(tmp[i]);
        }

        while (arr.size() > 0) {
            insert(arr.getAndRemove());
        }
    }

    public void noDups() {
        for (int i = 0; i < nElems - 1; i++) {
            long op = a[i];
            if (op != -1) {
                for (int j = i + 1; j < nElems; j++) {
                    if (a[j] == op) {
                        delete(j);
                        j--;
                    }
                }
            }
        }
    }
}

////////////////////////////////////////////////////////////////
class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
// Размер массива
        OrdArray arr;
// Ссылка на массив
        arr = new OrdArray(maxSize);
// Создание массива
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(77);
        arr.insert(77);
        arr.insert(77);
        arr.insert(77);
        arr.insert(00);
        arr.insert(66);
        arr.insert(77);
        arr.display();
        arr.noDups();
        arr.display();

    }
}
