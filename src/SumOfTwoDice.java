public class SumOfTwoDice {
    public static void main(String[] args) {
        double a = Math.random() * 6 + 1;
        int aa = (int) (a % 10);
        double b = Math.random() * 6 + 1;
        int bb = (int) (b % 10);
        int sum = aa + bb;
        System.out.println(sum);
    }
}
