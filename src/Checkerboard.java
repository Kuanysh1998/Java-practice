public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double X0 = 0.0;
        double X1 = 16.0;
        double Y0 = 0.0;
        double Y1 = 16.0;
        StdDraw.setPenRadius(0.001);
        //StdDraw.filledSquare(0.0, 0.0, 1.0);
        StdDraw.setXscale(X0, X1);
        StdDraw.setYscale(Y0, Y1);
        double piece = X1 / n;
        for (int i = 1; i < n; i++) {
            StdDraw.line(X0, (Y0 + piece) * i, X1, (Y0 + piece) * i);
            StdDraw.line((X0 + piece) * i, Y0, (X0 + piece) * i, Y1);

        }

    }
}
