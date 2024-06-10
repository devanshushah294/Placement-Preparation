import java.util.Scanner;

public class _14_Program {
    public static String checkOddEven(int n) {
        int check = n & 1;
        return (check == 1) ? "Odd" : "Even";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkOddEven(n));
    }
}
