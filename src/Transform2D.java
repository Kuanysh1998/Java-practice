public class Transform2D {
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }

    public static double[] copy(double[] array) {
        double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void rotate(double[] x, double[] y, double theta) {
        double radians = Math.toRadians(theta);
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * Math.cos(radians) - y[i] * Math.sin(radians);
            y[i] = y[i] * Math.cos(radians) + x[i] * Math.sin(radians);
        }
    }

    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = {0, 1, 1, 0};
        double[] y = {0, 0, 2, 1};

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);

        rotate(x, y, 45.0);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);


    }
}
