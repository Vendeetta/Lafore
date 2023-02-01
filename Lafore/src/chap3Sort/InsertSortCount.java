package chap3Sort;

import java.util.Arrays;

public class InsertSortCount {

    public static void insertSortCount(int[] arr) {
        long copyCount = 0;
        long compareCount = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int tmp = arr[i];
            copyCount++;
            while (j > 0) {
                compareCount++;
                if (arr[j-1] >= tmp) {
                    arr[j] = arr[j - 1];
                    j--;
                } else {
                    break;
                }
            }
            copyCount++;
            arr[j] = tmp;
        }
        System.out.println("Copies = " + copyCount);
        System.out.println("Compares = " + compareCount);
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 2, 1, 99};
        insertSortCount(array);
        System.out.println(Arrays.toString(array));
    }
}
