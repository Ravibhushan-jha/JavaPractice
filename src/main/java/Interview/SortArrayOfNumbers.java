package Interview;

public class SortArrayOfNumbers {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 3, 4, 6, 7, 8};

        // Print original array
        System.out.print("Original array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform Bubble Sort
        bubbleSort(a);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j + 1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }
}
