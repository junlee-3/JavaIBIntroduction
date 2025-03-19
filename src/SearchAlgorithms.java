import java.util.ArrayList;

public class SearchAlgorithms {
    public static void main(String[] args) {
        int[] nums = {-12, 83, 38, 43, -84, 12, -45, -79, -9, -1, 39, -66, 21};

        int i1 = sequentialSearch(nums, 12); // should equal 5
        int i2 = sequentialSearch(nums, 66); // should equal -1
    }

    public static int sequentialSearch(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                return i;
            }
        }

        if (!found) {
            return -1;
        }
        return target;
    }

    public static int binarySearch(int[] arr, int target) {
        boolean found = false;

        int left = 0;
        int right = arr.length - 1;
        int middle = 0;

        while (left <= right && found == false) {
            middle = (left + right) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
        }


        return 0;
    }





}
