import java.util.Scanner;

public class _04_OddEven {
    public static boolean checkOddEven(int n) {
        int check = n & 1;
        if (check == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (checkOddEven(n)) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
