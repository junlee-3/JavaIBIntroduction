import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 1};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;

                    swapped = true;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
