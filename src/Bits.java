public class Bits {
    public static void main(String[] args) {
        int counter = 0;
        int num = Integer.parseInt(args[0]);
        while (num >= 1) {
            num = num / 2;
            counter++;
        }
        if (counter == 0) System.out.println("Illegal input");
        else System.out.println(counter);
    }
}
