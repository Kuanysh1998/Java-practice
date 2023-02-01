import java.util.ArrayList;
import java.util.Arrays;

public class Prosto {
    public static long[] getNumbers(long N) {
        long[] result = null;
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String num = Integer.toString(i);
            int M = num.length();
            int sum = 0;
            for (int j = 0; j < M; j++) {
                int x = Integer.parseInt(Character.toString(num.charAt(j)));
                sum = sum + (int) Math.pow(x, M);
            }

            if (Integer.toString(sum).equals(num)) list.add((long) sum);
        }
        result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(10000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
