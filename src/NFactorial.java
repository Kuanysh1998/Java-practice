public class NFactorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * i;
        }
        System.out.println(answer);
    }
}
