public class CounterAge {
    public static void main(String[] args) {
        int[] a = {25, 21, 26, 25, 25, 22, 30, 35, 90, 27, 25, 37, 31, 90, 96, 78, 80};
        int n = Integer.parseInt(args[0]);
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
