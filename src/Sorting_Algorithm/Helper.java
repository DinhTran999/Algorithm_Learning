package Sorting_Algorithm;

import java.util.Random;

public class Helper {
    public static int[] createArrayWithBound(int soPhanTu, int bound) {
        int[] arr = new int[soPhanTu];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
