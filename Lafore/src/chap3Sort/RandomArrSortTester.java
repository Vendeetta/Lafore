package chap3Sort;

import java.util.Random;

public class RandomArrSortTester {

    public static void main(String[] args) {
        int max = 10_000;

        int[] arr = randomCreateAndFillArr(max);
        long start = System.currentTimeMillis();
//        BubbleSort.bubbleSort(arr);
        long end = System.currentTimeMillis();
//        System.out.println("Время затраченное на сортировку пузырьком: " + (end - start));

//        arr = createAndFillArr(max);
//        start = System.currentTimeMillis();
//        SelectSort.selectSort(arr);
//        end = System.currentTimeMillis();
//        System.out.println("Время затраченное на сортировку выбором: " + (end - start));

        arr = randomCreateAndFillArr(max);
        start = System.currentTimeMillis();
        InsertSort.insertSort(arr);
        end = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку вставкой: " + (end - start));

//        arr = createAndFillArr(max);
//        start = System.currentTimeMillis();
//        DoubleBubbleSort.bubbleSort(arr);
//        end = System.currentTimeMillis();
//        System.out.println("Время затраченное на сортировку двойным пузырьком: " + (end - start));
//
//        arr = createAndFillArr(max);
//        start = System.currentTimeMillis();
//        OddEvenSort.oddEvenSort(arr);
//        end = System.currentTimeMillis();
//        System.out.println("Время затраченное на сортировку четный-нечетный: " + (end - start));

        arr = randomCreateAndFillArr(max);
//        arr[99999] = 11;
//        arr[99989] = 22;
        start = System.currentTimeMillis();
        InsertSortCount.insertSortCount(arr);
        end = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку вставкой: " + (end - start));
    }





    public static int[] randomCreateAndFillArr(int max) {
        int[] array = new int[max];
        for (int i = 0; i < max; i++) {
            array[i] = new Random().nextInt(max);
        }
        return array;
    }

    public static int[] reverseCreateAndFillArr (int max) {
        int[] array = new int[max];
        int key = max;
        for (int i = 0; i < max; i++) {
            array[i] = key--;
        }
        return array;
    }

    public static int[] orderedCreateAndFillArr (int max) {
        int[] array = new int[max];
        for (int i = 0; i < max; i++) {
            array[i] = i;
        }
        return array;
    }
}
