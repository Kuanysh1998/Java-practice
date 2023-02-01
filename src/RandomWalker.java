public class RandomWalker {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 4 + 1);
            if (random == 1) x++;
            if (random == 2) y++;
            if (random == 3) x--;
            if (random == 4) y--;
        }
        int squared_distance = x * x + y * y;
        System.out.println("(" + x + "," + y + ")");
        System.out.println(squared_distance);

    }
}
