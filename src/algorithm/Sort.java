package algorithm;

public class Sort {
    long executionTime = 0;
    /*Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    // Selection Sort
    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //Insertion Sort
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i=0; i<array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j -1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // Bubble Sort
    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //mergeSort
    public int [] mergeSort(int [] array,int l,int m,int r){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        //Create temp arrays
        int L[] = new int [n1];
        int R[] = new int [n2];
        //Copy data to temp arrays
        for (int i=0; i<n1; ++i)
            L[i] = array[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = array[m + 1+ j];
        //Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else
            {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1)
        {
            array[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2)
        {
            array[k] = R[j];
            j++;
            k++;
        }
        return list;
    }
    void mergeSort(int[] array)
    {
        int l = 0, r = 0;
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
            // Sort first and second halves
            mergeSort(array);
            mergeSort(array);
            // Merge the sorted halves
            mergeSort(array, l, m, r);
        }
    }
    //Quick Sort
    public int quickSort(int[] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int high=0;
        int pivot = array[high];
        int low=0;
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot)
            {
                i++;
                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
    void sort(int array[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, array[pi] is
              now at right place */
            int pi = quickSort(array);
            // Recursively sort elements before
            // partition and after partition
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }
    //Heap Sort
    public int [] heapSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //int n = array.length;
        // Build heap (rearrange array)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);
        // One by one extract an element from heap
        for (int i = array.length - 1; i >= 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    void heapify(int array[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int l = 2 * i + 1;  // left = 2*i + 1
        int r = 2 * i + 2;  // right = 2*i + 2
        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;
        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;
        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    //Bucket Sort
    public int [] bucketSort(int[] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int maxVal = 100;
        int [] bucket=new int[maxVal+1];
        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }
        for (int i=0; i<array.length; i++)
            bucket[array[i]]++;
        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++)
                array[outPos++]=i;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        int n = array.length;
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
