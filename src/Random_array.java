public class Random_array {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Double[] a = new Double[n];
        double min = 0.99;
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
            if (a[i] < min) {
                min = a[i];
            }
            System.out.println(a[i]);
        }
        {

        }
        System.out.println("minimum value is = " + min);
    }
}
