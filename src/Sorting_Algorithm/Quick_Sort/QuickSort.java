package Sorting_Algorithm.Quick_Sort;

import Sorting_Algorithm.Helper;

import java.util.Scanner;

public class QuickSort {
    public QuickSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        int[] arr = Helper.createArrayWithBound(soPhanTu, 100);
        System.out.println("Mang da tao ra: ");
        Helper.printArray(arr);
        System.out.println();
        //run Quick sort
        sortByQuickAlgorithm(arr,0,arr.length-1);

        System.out.println("Mang sau khi da sap xep: ");
        Helper.printArray(arr);
    }

    private void sortByQuickAlgorithm(int[] arr, int start, int end){


        if(start>=end){
            return;
        }

        int startPoint = start;
        int endPoint = end;

        int pivot=arr[start];

        int left = startPoint;
        int right = endPoint;
        do {
            while (arr[right]>pivot){
                right--;
                if(right==left){
                    arr[right] = pivot;
                    break;
                }

            }
            if(right>left){
                arr[left]=arr[right];
                left++;
                while (arr[left]<pivot){
                    left++;
                    if(right==left){
                        arr[right] = pivot;
                        break;
                    }
                }
                if(right>left){
                    arr[right]=arr[left];

                }
            }


        } while (right>left);


        sortByQuickAlgorithm(arr,startPoint,right-1);
        sortByQuickAlgorithm(arr,right+1,endPoint);

    }

}
