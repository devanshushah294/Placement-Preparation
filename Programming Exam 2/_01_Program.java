import java.util.Scanner;

public class _01_Program {
    public static int maxOfThreee(int n1,int n2,int n3) {
        return (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1 = sc.nextInt();
        System.out.println("Enter the number");
        int n2 = sc.nextInt();
        System.out.println("Enter the number");
        int n3 = sc.nextInt();
        System.out.println(maxOfThreee(n1, n2, n3));   
    }
}