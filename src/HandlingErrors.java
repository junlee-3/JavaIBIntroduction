import java.util.*;

public class HandlingErrors {
    public static void main(String[] args) {
        parseDouble("Enter a number: ");
        String[] array = {"Good", "Morning", "Bricksburg!"};
        System.out.println(findValueofArray(array, 2));
    }

    public static double parseDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                Scanner scanner = new Scanner(System.in);
                double s = scanner.nextDouble();
                return s;
            } catch (Exception e) {
                System.out.println("Invalid input, try again!");
            }
        }
    }

    public static String findValueofArray(String[] arr, int index) {
        while(true) {
            try {
                return arr[index];
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index is out of bounds");
            }
        }
    }
}