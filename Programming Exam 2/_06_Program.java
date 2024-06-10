import java.util.Scanner;

public class _06_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number" + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("Odd sum = " + oddSum);
        System.out.println("even sum = " + evenSum);
    }
}
