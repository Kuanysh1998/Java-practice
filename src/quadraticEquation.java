public class quadraticEquation {
    public static void main(String[] args) {
        double x1;
        double x2;
        double D;
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        D = (b * b) - 4 * a * c;
        x1 = (-b + Math.sqrt(D)) / 2 * a;
        x2 = (-b - Math.sqrt(D)) / 2 * a;
        System.out.println("x1 = " + x1 + " x2 = " + x2);
    }
}
