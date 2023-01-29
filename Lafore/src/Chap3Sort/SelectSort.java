package Chap3Sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 2, 1, 99};
        selectSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = min;
            arr[index] = tmp;
        }
    }
}
