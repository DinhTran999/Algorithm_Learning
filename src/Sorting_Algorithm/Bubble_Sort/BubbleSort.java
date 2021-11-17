package Sorting_Algorithm.Bubble_Sort;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public BubbleSort (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soLuongPhanTu = Integer.parseInt(sc.nextLine());
        int[] arr = new int[soLuongPhanTu];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Mang da tao ra: ");
        printArray(arr);
        System.out.println();


        SortingByBubbleAlgorithm(arr);

        System.out.println("Mang sau khi da sap xep: ");
        printArray(arr);


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

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
