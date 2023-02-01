public class infinite_loop {
    public static void main(String[] args) {
        int x = 2011873581;
        while (true) {
            System.out.println(x);
            x = x + 10;
        }
    }
}
