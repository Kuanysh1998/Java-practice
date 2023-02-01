public class SumRecursion {
    public static int SumRec(int n) {

        if (n == 1) return 1;
        return SumRec(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(SumRec(4));
    }
}
// f(n0 = 1+2+3+4+....+n
