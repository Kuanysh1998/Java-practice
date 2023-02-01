public class Nint {

    public static int nint(double a) {
        int x = (int) ((a * 10) % 10);
        if (x > 5) return (int) (a + 1);
        else return (int) (a);


    }

    public static void main(String[] args) {
        System.out.println(nint(4.66));
    }
}
