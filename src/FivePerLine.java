public class FivePerLine {
    public static void main(String[] args) {
        int n = 2000;
        for (int i = 1000; i <= n; i++) {
            if (i % 5 == 4 && i != 1000) {
                System.out.print(i);
                System.out.println();
            } else System.out.print(i + "  ");
        }
    }
}
