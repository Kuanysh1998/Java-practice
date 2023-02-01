public class Distinct {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int sum = 0;
        if (a == b && b == c)
            sum = 1;
        else if (a != b && b != c)
            sum = 3;
        else if ((a == b && b != c) || (a != b && b == c))
            sum = 2;

        System.out.println(sum);


    }
}
