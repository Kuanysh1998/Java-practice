public class Checkerboard2 {
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
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                //StdDraw.square((X0 + piece) * i, Y0, piece / 2);
                if (i % 2 == j % 2) {

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare((X0 + piece) * i, (Y0 + piece) * j, piece);
                } else {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.filledSquare((X0 + piece) * i, (Y0 + piece) * j, piece);
                }
            }
        }
    }
}



