package Sorting_Algorithm;

import java.util.ArrayList;
import java.util.List;
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

    public static List<Integer> createListWithBound(int soPhanTu,int bound){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < soPhanTu; i++) {
            list.add(random.nextInt(bound));
        }
        return list;
    }


    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static <T> void printList(List<T> list){
        list.forEach(element-> {
            System.out.print(element+" ");
        });
    }

}
