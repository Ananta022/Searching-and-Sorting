public class bubblesort {
    public static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void bubbleSort(int arr[]) {
        boolean isSorted; // Declare the sorted flag
        for (int i = 0; i < arr.length - 1; i++) {
            isSorted = true; //Assume array is sorted at the beginning of each pass
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false; // Set flag to false, as swapping is done
                }
            }
            // If no swaps happened, the array is already sorted
            if (isSorted) {
                System.out.println("Array is already sorted.\n");
                return;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {54,78,41,25,87,65,25,75,49,15};
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        printArr(arr);
    }
}
