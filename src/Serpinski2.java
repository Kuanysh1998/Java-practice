public class Serpinski2 {
    public static void filledtriangle() {
        double[] x = {0.5, 0.25, 0.75};
        double[] y = {0.0, 0.5, 0.5};
        double[] mainx = {0.0, 1.0, 0.5};
        double[] mainy = {0.0, 0.0, 0.5};
        StdDraw.polygon(mainx, mainy);
        StdDraw.filledPolygon(x, y);
    }

    public static void main(String[] args) {
        Serpinski2.filledtriangle();
    }
}
