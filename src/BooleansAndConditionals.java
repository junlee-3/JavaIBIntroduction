import java.util.Scanner;

public class BooleansAndConditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Who is Older?

        System.out.println("Enter your Name and Age, separated by a space:");
        String user1 = input.nextLine();
        String[] user1Data = user1.split(" ");
        String user1Name = user1Data[0];
        int user1Age = Integer.parseInt(user1Data[1]);

        System.out.println("Enter another person's Name and Age, separated by a space:");
        String user2 = input.nextLine();
        String[] user2Data = user2.split(" ");
        String user2Name = user2Data[0];
        int user2Age = Integer.parseInt(user2Data[1]);

        if (user1Age > user2Age) {
            System.out.println(user1Name + " is Older");
        } else {
            System.out.println(user2Name + " is Older");
        }

        double tipAmount = 0;
        System.out.println("Enter the total amount of your bill");
        double billAmount = input.nextDouble();
        input.nextLine();
        System.out.println("How was the service? (Terrible, Good, Excellent)");
        String service = input.nextLine();

        //Calculating Tips

        if (service.equalsIgnoreCase("Terrible")) {
            tipAmount = billAmount * 0.0;
        } else if (service.equalsIgnoreCase("Good")) {
            tipAmount = billAmount * 0.10;
        } else if (service.equalsIgnoreCase("Excellent")) {
            tipAmount = billAmount * 0.20;
        } else {
            System.out.println("Invalid type of service");
        }

        System.out.println("Bill was " + billAmount + "," + " Service was " + service);
        System.out.println("Tip Amount + " + tipAmount);
        System.out.println("You owe " + billAmount + tipAmount);

        //Highest Number
        System.out.println("Enter Three Integers, Seperated by a comma");
        String numbers = input.nextLine();
        String[] parts = numbers.split(",");

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int num3 = Integer.parseInt(parts[2]);

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");
        }

        if ((num1*num1) + (num2*num2) == (num3*num3)) {
            System.out.println(num1 + " and" + " " + num2 + " are a pythagorean triple");
        }

    }
}
