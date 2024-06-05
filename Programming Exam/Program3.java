import java.util.Scanner;

public class Program3 {
    public static int findTrailingZeros(int n) {
        int fiveCount = 0;
        for (int i = 5; i <= n; i += 5) {
            int temp = i;
            while (temp % 5 == 0) {
                temp /= 5;
                fiveCount++;
            }
        }
        return fiveCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(findTrailingZeros(n));
    }
}
