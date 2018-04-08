package algorithm;

import org.testng.Assert;
import java.util.Random;

public class UnitTestSorting {
    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        //int[] num = new int[100];
        int[] unsortedArray = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < unsortedArray.length; i++)
            unsortedArray[i] = rand.nextInt(100);
        //int[] unSortedArray = unsortedArray.length();
        //int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        //int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        int[] sortedArray = sort.selectionSort(unsortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.insertionSort(unsortedArray);
        //verify if the unsorted array is sorted by the insertion sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.bubbleSort(unsortedArray);
        //verify if the unsorted array is sorted by the bubble sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.mergeSort(unsortedArray);
        //verify if the unsorted array is sorted by the merge sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.quickSort(unsortedArray);
        //verify if the unsorted array is sorted by the quick sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.heapSort(unsortedArray);
        //verify if the unsorted array is sorted by the heap sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.bucketSort(unsortedArray);
        //verify if the unsorted array is sorted by the bucket sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        sort.shellSort(unsortedArray);
        //verify if the unsorted array is sorted by the shell sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unsortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
