import java.util.HashSet;
import java.util.Scanner;

public class _09_Program {
    public static int[] removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number");
            set.add(sc.nextInt());
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr[i] = num;
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        printArray(removeDuplicates());
    }
}
