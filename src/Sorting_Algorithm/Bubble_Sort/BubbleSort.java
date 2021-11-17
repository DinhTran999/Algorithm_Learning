package Sorting_Algorithm.Bubble_Sort;

import Sorting_Algorithm.Helper;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public BubbleSort (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        int[] arr = Helper.createArrayWithBound(soPhanTu,100);
        System.out.println("Mang da tao ra: ");
        Helper.printArray(arr);
        System.out.println();
        SortingByBubbleAlgorithm(arr);
        System.out.println("Mang sau khi da sap xep: ");
        Helper.printArray(arr);


    }

    private void SortingByBubbleAlgorithm(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }




}
