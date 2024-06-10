/**
 * _03_Palindrome
 */
public class _03_Palindrome {

    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}