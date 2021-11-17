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



    }


}
