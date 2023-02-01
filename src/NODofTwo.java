import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NODofTwo {
    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        Scanner s = new Scanner(System.in);
        int ans = 7777;

        int a = s.nextInt();
        int b = s.nextInt();

        if (a % b == 0) {
            ans = b;
        }

        if (b % a == 0) {
            ans = a;
        } else {
            int mod = 181981;
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            while (mod != 0) {
                if (max % min != 0) {
                    mod = max % min;
                    max = min;
                    min = mod;
                    ans = mod;
                }

                if (max % min == 0) {
                    mod = max % min;

                }
                

            }


        }

        System.out.println(ans);
    }
}
