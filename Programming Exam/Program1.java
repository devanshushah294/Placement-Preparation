import java.util.Scanner;

public class Program1 {
    public static int strStr(String hayStack, String needle) {
        return hayStack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String hayStack = sc.nextLine();
        System.out.println("Enter the String 2: ");
        String needle = sc.nextLine();
        System.out.println(strStr(hayStack, needle));
    }
}