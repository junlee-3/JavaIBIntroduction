import java.util.Scanner;

public class TypesAndOperations {
    public static void Lesson1() {
        int num = 79;
        int tens = 10 / 7;

        //Finding the Century
        int year = 2000;
        year = year - 1;
        year = year /  100;
        year = year + 1;
        System.out.println(year);

        // Quadratic Problem
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        double discriminant = b*b - 4*a*c;
        if (discriminant < 0) {
            throw new ArithmeticException("Quadratic has no solutions");
        }
        double x = (-(b)+Math.sqrt(discriminant)) / (2*a);
        double x2 = (-(b)-Math.sqrt(discriminant)) / (2*a);
        System.out.println(x);
        System.out.println(x2);


        //How to define a Scanner
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
    }

    public static void Lesson2() {
        /* String text = "This is a sample text";

        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(5));
        System.out.println(text.indexOf(" "));
        System.out.println(text.substring(10,16));
        System.out.println(text.replace(" ", "_"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase()); */

        //Given a string, returns the string made of its first two chars.
        String string = "Hello World";
        System.out.println(string.substring(0,2));

        //Removes the first and last character of a string
        System.out.println(string.substring(1, string.length()-1));

        //Given a String, return a new string made of 2 copies of the last 2 characters
        System.out.println(string.substring(string.length() - 2).repeat(2));

        //Returns the Initials for a name
        String name = "Jun Lee";
        int lastNameIndex = name.indexOf(" ") + 1;
        System.out.println("" + name.charAt(0) + name.charAt(lastNameIndex));

        System.out.println("Java uses \"\" to denote a String");

        //Parses the date string and outputs day, month, and year.
        String date = "07/02/2025";
        String day = date.substring(0,2);
        String month = date.substring(3,5);
        String year = date.substring(6,10);

        month = switch (month) {
            case "01" -> "January";
            case "02" -> "February";
            case "03" -> "March";
            case "04" -> "April";
            case "05" -> "May";
            case "06" -> "June";
            case "07" -> "July";
            case "08" -> "August";
            case "09" -> "September";
            case "10" -> "October";
            case "11" -> "November";
            case "12" -> "December";
            default -> "Invalid month";
        };

        System.out.println(day + "th " + month + " " + year);
    }

}
