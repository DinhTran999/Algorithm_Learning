package Sorting_Algorithm.Selection_Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    int[] arr = new int[]{10,3,8,0,9,4,8,2};
    int[] expectedArr = new int[]{0,2,3,4,8,8,9,10};
   @Test
    public void test1 (){

       SelectionSort.sortBySelectionAlgorithm(arr);
       assertArrayEquals(expectedArr,arr);

   }


}