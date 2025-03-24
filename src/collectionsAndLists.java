import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import jets.Jets;

public class collectionsAndLists {
    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        mergeTo(num1, num2);

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

        for (int i = 0; i <= 100; i+=2) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i <= 10; i++) {
            list.removeLast();
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

    public static void mergeTo(List<Integer> baseList, List<Integer> listToAdd) {
        if (!listToAdd.isEmpty()) {
            baseList.addAll(listToAdd);
            System.out.println(baseList);
        } else {
            System.out.println("List is empty");
        }
    }
}
