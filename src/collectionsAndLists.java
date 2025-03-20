import java.util.Arrays;

public class collectionsAndLists {
    public static void main(String[] args) {
        int indexEnd = 0;
        int arr[] = new int[26];
        for (int i = 0; i < 52; i+=2) {
            arr[indexEnd] = i;
            indexEnd++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(indexEnd);

        arr = Arrays.copyOf(arr, indexEnd-10);

        System.out.println(Arrays.toString(arr));

        arr[4] = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 4; i < indexEnd-2; i++) {
            arr[i] = arr[i+1]; // Shift
            indexEnd--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
