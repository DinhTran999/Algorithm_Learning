package SearchAlgorithms;

import Sorting_Algorithm.Helper;

import java.util.Scanner;

public class TernarySearch {
    public TernarySearch(){
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
        System.out.println("Nhap gia tri can tim theo Ternary Search: ");
        int soCanTim = Integer.parseInt(sc.nextLine());
        System.out.println("Tim thay vi tri cua so can tim tai i = "+ternarySearch(arr,soCanTim,0,arr.length-1));
    }

    private int ternarySearch(int[]arr,int searchNumber,int left,int right){
            if(left>right||searchNumber>arr[right]||searchNumber<arr[left]){
                return -1;
            }

            int mid1 = left+(right-left)/3;
            int mid2 = right-(right-left)/3;
            if(searchNumber==arr[mid1]){
                return mid1;
            } else if(searchNumber==arr[mid2]){
                return mid2;
            } else if(searchNumber<arr[mid1]){
                return ternarySearch(arr,searchNumber,left,mid1-1);
            } else if(searchNumber>arr[mid2]){
                return ternarySearch(arr,searchNumber,mid2+1,right);
            } else {
                return ternarySearch(arr,searchNumber,mid1+1,mid2-2);
            }


    }


}


