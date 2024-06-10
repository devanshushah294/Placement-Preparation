import java.util.Scanner;

public class _13_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int num1 = (n1 < n2 && n1 < n3) ? n1 : (n2 < n3 ? n2 : n3);
        int num3 = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3 ? n2 : n3);
        int num2 = (n1 > num1 && n1 < num3) ? n1 : (n2 < num3 ? n2 : n3);
        System.out.println(num1 + " " + num2 + " " + num3 + " ");
    }
}
