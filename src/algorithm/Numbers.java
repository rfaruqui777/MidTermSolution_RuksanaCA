package algorithm;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//import databases.ConnectDB;

public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */
	public static void main(String[] args) throws Exception {
		int[] num = new int[1000000];
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(100);
		}
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");
		List<String> numbersSelection = connectDB.readDataBase("selection_sort", "SortingNumbers");
		for (String st : numbersSelection) {
			System.out.println(st);
		}
		int n = num.length;
		randomize(num, n);
		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Insertion_sort", "SortingNumbers");
		List<String> numbersInsertion = connectDB.readDataBase("Insertion_sort", "SortingNumbers");
		for (String st : numbersInsertion) {
			System.out.println(st);
		}
		//int n = num.length;
		randomize(num, n);
		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Bubble_sort", "SortingNumbers");
		List<String> numbersBubble = connectDB.readDataBase("Bubble_sort", "SortingNumbers");
		for (String st : numbersBubble) {
			System.out.println(st);
		}
		randomize(num, n);
		//Merge Sort
		algo.mergeSort(num);
		long MergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + insertionSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Insertion_sort", "SortingNumbers");
		List<String> numbersMerge = connectDB.readDataBase("Insertion_sort", "SortingNumbers");
		for (String st : numbersMerge) {
			System.out.println(st);
		}
		randomize(num, n);
		//Heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Heap_sort", "SortingNumbers");
		List<String> numbersHeap = connectDB.readDataBase("Heap_sort", "SortingNumbers");
		for (String st : numbersHeap) {
			System.out.println(st);
		}
		randomize(num, n);
		//Quick Sort
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Quick_sort", "SortingNumbers");
		List<String> numbersQuick = connectDB.readDataBase("Quick_sort", "SortingNumbers");
		for (String st : numbersQuick) {
			System.out.println(st);
		}
		randomize(num, n);
		//Bucket Sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Bucket_sort", "SortingNumbers");
		List<String> numbersBucket = connectDB.readDataBase("Bucket_sort", "SortingNumbers");
		for (String st : numbersBucket) {
			System.out.println(st);
		}
		randomize(num, n);
		//Shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectDB.InsertDataFromArryToMySql(num, "Shell_sort", "SortingNumbers");
		List<String> numbersShell = connectDB.readDataBase("Bucket_sort", "SortingNumbers");
		for (String st : numbersShell) {
			System.out.println(st);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}

