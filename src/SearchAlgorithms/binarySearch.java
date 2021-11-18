package SearchAlgorithms;

import Sorting_Algorithm.Helper;

import java.util.Scanner;

public class binarySearch {
    public binarySearch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        int[]arr=new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            arr[i]=i*3;
        }

        System.out.println("Mang da tao ra: ");
        Helper.printArray(arr);
        System.out.println();
        //run result
        System.out.println("Nhap gia tri can tim theo binary Search: ");
        int soCanTim = Integer.parseInt(sc.nextLine());
        System.out.println("Tim thay vi tri cua so can tim tai i = "+searchBinary(arr,soCanTim,0,arr.length-1));

    }

    public static int searchBinary(int[] arr,int searchNumber, int left, int right) {
       /*int left = 0;
       int right = arr.length-1;
       while (left<=right){
           int mid = (left+right)/2;
           if(searchNumber==arr[mid]){
               return mid;
           } else if(searchNumber>arr[mid]){
               left=mid+1;
           } else {
               right=mid-1;
           }
       }
       return -1;*/

        if(left>right||searchNumber>arr[right]||searchNumber<arr[left]){
            return -1;
        }

        int mid = (left+right)/2;
        if(searchNumber ==arr[mid]){
            return mid;
        } else if(searchNumber>arr[mid]){
            return searchBinary(arr,searchNumber,mid+1,right);
        } else {
            return searchBinary(arr,searchNumber,left,mid-1);
        }


    }
}
