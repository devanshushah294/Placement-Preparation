import java.util.Scanner;

public class _12_Program {
    public static int getSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int n2 = sc.nextInt();
        return (n1 % 10) + (n2 % 10);
    }

    public static void main(String[] args) {
        System.out.println(getSum());
    }
}
