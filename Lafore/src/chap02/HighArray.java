package chap02;

public class HighArray {
    // highArray.java
// Класс массива с высокоуровневым интерфейсом
// Запуск программы: C>java chap02.HighArrayApp
////////////////////////////////////////////////////////////////
        private long[] a;
        // Ссылка на массив a
        private int nElems;
        // Количество элементов в массиве
//-----------------------------------------------------------
        public HighArray(int max)
// Конструктор
        {
            a = new long[max];
// Создание массива
            nElems = 0;
// Пока нет ни одного элемента
        }
//-----------------------------------------------------------Интерфейсы классов  

    public int getnElems() {
        return nElems;
    }

    public boolean find(long searchKey)
        {
// Поиск заданного значения
            int j;
            for(j=0; j<nElems; j++)
// Для каждого элемента
                if(a[j] == searchKey)
// Значение найдено?
                    break;
// Да - выход из цикла
            if(j == nElems)
// Достигнут последний элемент?
                return false;
// Да
            else
                return true;
// Нет
        }
        //-----------------------------------------------------------
        public void insert(long value)
// Вставка элемента в массив
        {
            a[nElems] = value;
// Собственно вставка
            nElems++;
// Увеличение размера
        }
        //-----------------------------------------------------------
        public boolean delete(long value)
        {
            int j;
            for(j=0; j<nElems; j++)
// Поиск заданного значения
                if( value == a[j] )
                    break;
            if(j==nElems)
// Найти не удалось
                return false;
            else
// Значение найдено
            {
                for(int k=j; k<nElems; k++) // Сдвиг последующих элементов
                    a[k] = a[k+1];
                nElems--;
                return true;
            }
        }
        //-----------------------------------------------------------
        public void display()
        {
            for(int j=0; j<nElems; j++)
                System.out.print(a[j] + " "); // Вывод
            System.out.println("");
        }

        public long removeMax(){
            long max = -1;
            for (int i = 0; i < nElems; i++) {
                if (a[i] > max){
                    max = a[i];
                }
            }
            if(max > -1) delete(max);
            return max;
        }
//-----------------------------------------------------------
    } // Конец класса chap02.HighArray
    class HighArrayApp
    {
       
       
        public static void main(String[] args)
        {
            int maxSize = 100;
           
                HighArray arr;
            arr = new HighArray(maxSize); // Создание массива
            arr.insert(77);
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(88);
            arr.insert(11);
            arr.insert(00);
            arr.insert(66);
            arr.insert(33);// Вставка 10 элементов
            arr.display();// Вывод элементов
            int searchKey = 35;
            if( arr.find(searchKey) )
                System.out.println("Found " + searchKey);
            else
                System.out.println("Can't find " + searchKey);
            arr.delete(00);
            arr.delete(55);
            arr.delete(99);
            arr.display();

            HighArray arr1 = new HighArray(50);
            System.out.println(arr.getnElems());
            while (arr.getnElems() > 0){
                arr1.insert(arr.removeMax());
            }
            arr.display();
            arr1.display();
        }
    } // Конец класса chap02.HighArrayApp
////////////////////////////////////////////////////////////////