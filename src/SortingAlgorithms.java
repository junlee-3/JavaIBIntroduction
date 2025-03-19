import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 1};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;

        while (swapped) {
            int lastIndex = arr.length - 1;
            swapped = false;
            for (int i = 0; i < lastIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
                lastIndex--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
