package Sorting_Algorithm.Quick_Sort;

import Sorting_Algorithm.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
    public QuickSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu mang so nguyen can tao: ");
        int soPhanTu = Integer.parseInt(sc.nextLine());
        //int[] arr = Helper.createArrayWithBound(soPhanTu, 100);
        //int[]arr = new int[]{59,61,5,78,4,43,19,60,63,71};

        List<Integer> list = Helper.createListWithBound(soPhanTu, 100);

        System.out.println("Mang da tao ra: ");
        //Helper.printArray(arr);
        Helper.printList(list);
        System.out.println();
        //run Quick sort
        //sortByQuickAlgorithm(arr, 0, arr.length - 1);
        List<Integer> result = quickSort(list);
        System.out.println("Mang sau khi da sap xep: ");
        //Helper.printArray(arr);
        Helper.printList(result);
    }

    private void sortByQuickAlgorithm(int[] arr, int start, int end) {


        if (start >= end || end > arr.length - 1 || start < 0) {
            return;
        }

        int startPoint = start;
        int endPoint = end;

        int pivot = arr[start];

        int left = startPoint;
        int right = endPoint;
        do {
            while (arr[right] > pivot) {
                right--;
                if (right <= left) {
                    arr[right] = pivot;
                    break;
                }

            }
            if (right > left) {
                arr[left] = arr[right];
                left++;
                while (arr[left] < pivot) {
                    left++;
                    if (right <= left) {
                        arr[right] = pivot;
                        break;
                    }
                }
                if (right > left) {
                    arr[right] = arr[left];

                }
            }


        } while (right > left);


        sortByQuickAlgorithm(arr, startPoint, right - 1);
        sortByQuickAlgorithm(arr, right + 1, endPoint);

    }

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        int pivot = arr.get(0);
        List<Integer> smallerArray = new ArrayList<>();
        List<Integer> greaterArray = new ArrayList<>();

        int left = 0;
        int right = arr.size() - 1;
        do {
            while (arr.get(right) > pivot && right > left) {
                greaterArray.add(arr.get(right--));
            }
            if (right > left) {
                smallerArray.add(arr.get(right));
                left++;
                while (arr.get(left) < pivot && right > left) {
                    smallerArray.add(arr.get(left++));

                }
                if (right > left) {
                    greaterArray.add(arr.get(left));
                    right--;
                }
            }


        } while (right > left);

        List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(quickSort(smallerArray));
        sortedList.add(pivot);
        sortedList.addAll(quickSort(greaterArray));
        return sortedList;

    }
}
