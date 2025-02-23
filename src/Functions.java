public class Functions {
    public static void main(String[] args) {
        System.out.println(findLength("Hello"));
        System.out.println(passwordRequirements("passwoasdfrd1231243"));

    }

    public static double getAreaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static double getHypotenuse(double a, double b) {
        return Math.sqrt((a*a) + (b*b));
    }

    public static double getAverage(int[] integers) {
        int sum = 0;
        for(int i =0; i<integers.length; i++) {
            sum += integers[i];
        }
        return (double) sum /integers.length;
    }

    public static double calculateTax(double income) {
        if (income <= 18200) {
            return 0;
        } else if (income <= 45000) {
            return (income * 0.16);
        } else if (income <= 135000) {
            return 4288 + (income * 0.3);
        } else if (income <= 190000) {
            return 31288 + (income * 0.37);
        } else if (income > 190000) {
            return 51638 + (income * 0.45);
        }

        income -= 18200;

        return 0;
    }

    public static int findLength(String str) {
        int length = 0;
        for (int i = 0; i<=str.lastIndexOf("[^A-Za-z0-9]"); i++) {
            length++;
        }
        return length;
    }

    public static int findNDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
    public static int countAlphabet(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isAlphabetic(c)) {
                count = count + 1;
            }
        }
        return count;
    }

    public static boolean passwordRequirements(String password) {
        if(countAlphabet(password) > 8 && findNDigits(password) >= 3) {
            return true;
        } else {
            return false;
        }
    }


}
