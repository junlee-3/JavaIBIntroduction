import java.util.Arrays;

public class ArraysPart1 {
    public static void main(String[] args) {
        homework();
        homework2();

    }

    public static void exercise1() {
        int[] numbers = {93, 76, 41, 7, 33, 66, 64, 35, 39, 88, 21, 83, 81, 47, 60, 76, 31, 53, 37, 72, 28, 7, 82, 17, 57};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        System.out.println(sum);
        System.out.println(average);

        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        int left = 0, right = numbers.length - 1;
        double target = 80;
        while (left < right) {
            if (Math.abs(numbers[left] - target) <= Math.abs(numbers[right] - target)) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(numbers[left]);



    }

    public static void homework() {
        int n = 5;
        int size = 2 * n + 1;
        int[] numbers = new int[size];
        for (int i = 0; i <= n; i++) {
            numbers[i] = i;
            numbers[size - 1 - i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void homework2() {
        int value = 3;
        int max = 15;
        int size = max/value;
        int[] multiples = new int[size];
        for (int i = 0; i < (size); i++) {
            multiples[i] = value*(i+1);
        }
        System.out.println(Arrays.toString(multiples));
    }
}
