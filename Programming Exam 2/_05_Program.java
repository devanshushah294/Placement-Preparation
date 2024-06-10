public class _05_Program {
    public static void printSeries(int n) {
        if (n <= 0) {
            return;
        }
        int diff = 1;
        int number = 0;
        for (int i = 0; i < n - 1; i++, diff++) {
            number += diff;
            System.out.print(number + ",");
        }
        number += diff;
        System.out.println(number);
    }

    public static void main(String[] args) {
        printSeries(9);
    }
}
