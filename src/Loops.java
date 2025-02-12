public class Loops {
    public static void main(String[] args) {
        int integers = 1000;
        while (integers <= 2000) {
            if(integers % 5 == 0 && integers % 7 != 0) {
                System.out.println(integers);
            }
            integers++;
        }
    }
}
