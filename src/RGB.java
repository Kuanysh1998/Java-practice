public class RGB {
    public static void main(String[] args) {
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);
        double max = Math.max(Math.max(red, green), blue);
        double white = max / 255;
        double cyan = (white - red / 255.0) / white;
        double magenta = (white - green / 255.0) / white;
        double yellow = (white - blue / 255.0) / white;
        double black = 1 - white;
        System.out.println("cyan = " + cyan + "\nmagenta = " + magenta + "\nyellow = " + yellow + "\nblack = " + black);
    }
}
