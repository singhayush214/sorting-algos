/**
 * Complexity Analysis of Selection Sort 
 * Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops: 
 * One loop to select an element of Array one by one = O(N) 
 * Another loop to compare that element with every other Array element = O(N)
 * Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)
 */
class SelectionSort {
    public static void main (String[] args) {
        SelectionSort ob = new SelectionSort();
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
        for (int i = 0; i < arr.length-1; i++) {
            int min_value_index = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_value_index] ) min_value_index = j;
            }

            if (min_value_index > i) SelectionSort.swapValuesAtIndexes(arr, i, min_value_index);
        }
    }
}