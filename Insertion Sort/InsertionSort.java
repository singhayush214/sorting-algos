// Quick Understand --> https://www.youtube.com/watch?v=JU767SDMDvA

/**
 * Time Complexity of Insertion Sort 
 * 
 * The worst-case time complexity of the Insertion sort is O(N^2) 
 * The average case time complexity of the Insertion sort is O(N^2)
 * The time complexity of the best case is O(N).
 */
public class InsertionSort {
    public static void main (String[] args) {
        InsertionSort ob = new InsertionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array using Insertion Sort");
        ob.printArray(arr);
    }
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Swap the values of indexes provided
    static void swapValuesAtIndexes(int a[], int indexOne , int indexTwo){
        // Store value at first index in temp variable
        // and store second index's value into it
        int temp = a[indexOne];
        a[indexOne] = a[indexTwo];
        a[indexTwo] = temp;
    }

    // [64,25,12,22,11]
    void sort(int arr[]) {
        for (int i = 1 ; i < arr.length ; i++) {
            int key = arr[i], j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
