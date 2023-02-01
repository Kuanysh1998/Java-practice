public class Sierpinski {
    public static double height(double length) {
        double h = length * (Math.sqrt(3) / 2);
        return h;
    }

    public static void filledTriangle(double x, double y, double length) {
        double[] mainx = {x, x / 2, 0.5};
        double[] mainy = {y, , 1.0};
        double[] xs = new double[3];
        double[] ys = new double[3];
        StdDraw.setPenRadius(0.001);
        StdDraw.polygon(mainx, mainy);
        //StdDraw.filledPolygon(xs, ys);
    }

    public static void main(String[] args) {
        //double[] array1 = {0.0, 1.0, 0.5};
        // double[] array2 = {1.0, 1.0, 0.0};

        //StdDraw.filledPolygon(array1, array2);

    }
}
