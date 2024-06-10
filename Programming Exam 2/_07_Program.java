public class _07_Program {
    public static void main(String[] args) {
        int si = 151;
        int ei = 445;
        for (int i = si; i < ei; i += 2) {
            if (i % 7 == 0 && i % 3 != 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
