package SearchAlgorithms;

import Sorting_Algorithm.Helper;

import java.util.Scanner;

public class JumpSearch {
    public JumpSearch(){
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
        System.out.println("Nhap gia tri can tim theo Jump Search: ");
        int soCanTim = Integer.parseInt(sc.nextLine());
        System.out.println("Tim thay vi tri cua so can tim tai i = "+jumpSearch(arr,soCanTim,4));


    }
    public static int jumpSearch(int[]arr,int searchNumber, int blockSize){
        for (int i = 0; i <arr.length; i+=blockSize) {
            if(arr[i]==searchNumber){
                return i;
            } else if(searchNumber<arr[i]) {
                for (int j = i-blockSize; j <i ; j++) {
                    if(arr[j]==searchNumber){
                        return j;
                    }
                }
            }
        }
        return -1;
    }

}
