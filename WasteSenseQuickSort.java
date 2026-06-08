public class WasteSenseQuickSort {

    int partition(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    void printArray(int arr[]) {

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        int wasteGenerated[] = {450, 210, 600, 300, 520};

        WasteSenseQuickSort obj = new WasteSenseQuickSort();

        System.out.println("===== WasteSense Waste Ranking =====");

        System.out.print("\nBefore Sorting: ");

        obj.printArray(wasteGenerated);

        obj.quickSort(wasteGenerated, 0, wasteGenerated.length - 1);

        System.out.print("\nAfter Sorting: ");

        obj.printArray(wasteGenerated);

        System.out.println("\n\nZones Ranked Successfully");
        System.out.println("Time Complexity: O(n log n)");
    }
}