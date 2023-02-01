package chap3Sort;

import java.util.Arrays;

public class InsertSort {

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int tmp = arr[i];
            while (j > 0 && arr[j-1] >= tmp){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 2, 1, 99};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
