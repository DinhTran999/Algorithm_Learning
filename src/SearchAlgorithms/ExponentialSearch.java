package SearchAlgorithms;

import Sorting_Algorithm.Helper;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ExponentialSearch {
    public ExponentialSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        int[] arr = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            arr[i] = i * 3;
        }

        System.out.println("Mang da tao ra: ");
        Helper.printArray(arr);
        System.out.println();
        //run result
        System.out.println("Nhap gia tri can tim theo Exponential Search: ");
        int soCanTim = Integer.parseInt(sc.nextLine());
        System.out.println("Tim thay vi tri cua so can tim tai i = " + exponentialSearch(arr, soCanTim));




    }

    private int exponentialSearch(int[] arr, int searchNumber) {
        if (arr[0] == searchNumber) {
            return 0;
        }
        int i = 1;

        while (i<arr.length-1&&arr[i]<searchNumber) {
            i*=2;
        }
        return binarySearch.searchBinary(arr,searchNumber,i/2+1,Math.min(i,arr.length-1));

    }

}
