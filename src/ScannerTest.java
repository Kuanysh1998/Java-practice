import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println(s.nextLine());
        }
    }
}
