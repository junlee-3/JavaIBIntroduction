import jets.Jets;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        //Fizzbuzz
        for (int i = 0; i <= 50; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //Triangle thing
        String layer = "";
        for (int i = 0; i <= 5 ; i++) {
            layer += "*";
            System.out.print(layer);
            System.out.println("");
        }

        int n = Jets.inputInt("Enter the index of the fibbonaci sequence");
        System.out.println(fibonacci(n));

        String name = Jets.inputString("Enter your name");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(name.length() - 1 - i));
        }

        //Number Guessing Game
        Random rand  = new Random();
        int num = rand.nextInt(50);
        boolean win = false;

        while(!win) {
            int guess = Jets.inputInt("Enter a number");
            if (guess == num) {
                win = true;
            } else if (guess > num) {
                System.out.println("You are higher");
            } else if (guess < num) {
                System.out.println("You are lower");
            }
        }
        System.out.println("You win!");
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
