import java.util.Scanner;

public class _11_Program {
    public static double getBill(int units) {
        // double minBill = 100;
        double bill = 100;
        if (units <= 200) {
            bill += units * 0.8;
            return bill > 300 ? bill + ((bill * 12.36) / 100) : bill;
        } else {
            bill += 200 * 0.8;
        }
        if (units <= 300) {
            bill += (units - 200) * 0.9;
            return bill > 300 ? bill + ((bill * 12.36) / 100) : bill;
        } else {
            bill += 100 * 0.9;
        }
        bill += (units - 300);
        return bill > 300 ? bill + ((bill * 12.36) / 100) : bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units");
        int units = sc.nextInt();
        System.out.println(getBill(units));

    }
}
