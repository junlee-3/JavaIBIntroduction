import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import jets.Jets;

public class collectionsAndLists {
    public static void main(String[] args) {
        lists();

    }

    public static void arrayTest() {
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

        for(int i = 0; i < indexEnd; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void lists() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 50; i+=2) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i <= 10; i++) {
            list.remove(i);
        }
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        for (Integer i : list) {
            System.out.println(i);
        }

        list.clear();
        System.out.println(list);
    }
}
