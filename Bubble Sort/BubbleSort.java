/**
 * Complexity Analysis of Bubble Sort:
 * 
 * Time Complexity: O(N2)
 * Auxiliary Space: O(1)
 */

class BubbleSort {
    public static void main (String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
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
        for(int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    BubbleSort.swapValuesAtIndexes(arr, j, j+1);
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
    }
}