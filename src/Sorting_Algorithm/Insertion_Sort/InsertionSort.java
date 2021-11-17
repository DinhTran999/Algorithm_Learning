package Sorting_Algorithm.Insertion_Sort;

import Sorting_Algorithm.Helper;

import java.util.Scanner;

public class InsertionSort {
    public InsertionSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        int[] arr = Helper.createArrayWithBound(soPhanTu, 100);
        System.out.println("Mang da tao ra: ");
        Helper.printArray(arr);
        System.out.println();
        //run insertion sort
        sortByInsertionAlgorithm(arr);

        System.out.println("Mang sau khi da sap xep: ");
        Helper.printArray(arr);


    }

    private void sortByInsertionAlgorithm(int[] arr) {

       /* for (int i = 1; i < arr.length; i++) {
            int pivot = arr[i];
            for (int j = i - 1; j >= 0; j--) {

                if (pivot < arr[j]) {
                    arr[j + 1] = arr[j];
                    if(j==0){
                        arr[j] =pivot;
                    }
                } else {
                    arr[j + 1] = pivot;
                    break;
                }

            }

        }*/

        for (int i = 1; i < arr.length; i++) {
            int pivot = arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>pivot){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=pivot;

        }
    }

}
