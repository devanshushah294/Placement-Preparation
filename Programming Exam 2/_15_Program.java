import java.util.Scanner;

public class _15_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 1; i <= n; i++) {
            System.out.println(str.substring(0, i));
        }
    }
}
