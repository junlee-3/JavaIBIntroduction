import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 1};
        practicePaper(arr);

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int test = 1;

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
                test++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void practicePaper(int[] arr) {
        int limit = 4;
        boolean flag = true;

        while(flag) {
            flag = false;
            int counter = 0;

            if (counter < limit - 1) {
                if (arr[counter] > arr[counter + 1]) {
                    int temp = arr[counter];
                    arr[counter] = arr[counter + 1];
                    arr[counter + 1] = temp;
                    flag = true;
                }
            }
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
