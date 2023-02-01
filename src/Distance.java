public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double Dist = Math.sqrt(((0 - x) * (0 - x)) + ((0 - y) * (0 - y)));
        System.out.println(Dist);
    }
}
