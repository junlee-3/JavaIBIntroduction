import java.util.Arrays;

public class computationalThinking {
    public static void main(String[] args) {
        String result = "";
        int num = 9129;
        String strnum = num + "";
        int[] arr = new int[strnum.length()];
        for (int i = 0; i < strnum.length(); i++) {
            arr[i] = strnum.charAt(i) - '0';
        }

        for (int i = 0; i < strnum.length(); i++) {
            arr[i] = arr[i]*arr[i];
            result += arr[i];
        }
        System.out.println(result);

        int n = 5;


        for(int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {

                System.out.println("#");
            }
            System.out.println();
        }


        }
    }
