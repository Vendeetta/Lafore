package chap3Sort;

public class OrderedArrSortTester {

    public static void main(String[] args) {
        int max = 100_000;
        int[] arr = createAndFillArr(max);

        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку пузырьком: " + (end - start));

        arr = createAndFillArr(max);
        start = System.currentTimeMillis();
        SelectSort.selectSort(arr);
        end = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку выбором: " + (end - start));

        arr = createAndFillArr(max);
        start = System.currentTimeMillis();
        InsertSort.insertSort(arr);
        end = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку вставкой: " + (end - start));

        arr = createAndFillArr(max);
        start = System.currentTimeMillis();
        DoubleBubbleSort.bubbleSort(arr);
        end = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку двойным пузырьком: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
        }
        end = System.currentTimeMillis();
        System.out.println("Время затраченное на проход по массиву: " + (end - start));

    }





    public static int[] createAndFillArr (int max) {
        int[] array = new int[max];
        for (int i = 0; i < max; i++) {
            array[i] = i;
        }
        return array;
    }
}
