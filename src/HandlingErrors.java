import java.util.*;

public class HandlingErrors {
    public static void main(String[] args) {
        parseDouble("Enter a number: ");
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
}