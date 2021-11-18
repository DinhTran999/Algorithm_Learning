package Sorting_Algorithm.Selection_Sort;

import Sorting_Algorithm.Helper;

import java.util.Scanner;

public class SelectionSort {
    public SelectionSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        int[] arr = Helper.createArrayWithBound(soPhanTu, 100);
        System.out.println("Mang da tao ra: ");
        Helper.printArray(arr);
        System.out.println();
        //run insertion sort
        sortBySelectionAlgorithm(arr);

        System.out.println("Mang sau khi da sap xep: ");
        Helper.printArray(arr);
    }

    private void sortBySelectionAlgorithm(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int idxMin=i;
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(min>arr[j]){
                    idxMin = j;
                    min =arr[idxMin];
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[idxMin]=temp;
        }
    }

}
