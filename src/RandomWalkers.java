public class RandomWalkers {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int sum = 0;
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        for (int j = 0; j < trials; j++) {
            for (int i = 0; i < n; i++) {
                int random = (int) (Math.random() * 4 + 1);
                if (random == 1) x++;
                if (random == 2) y++;
                if (random == 3) x--;
                if (random == 4) y--;

            }
            int squared_distance = x * x + y * y;
            sum = sum + squared_distance;
            x = 0;
            y = 0;

        }
        Double mean_squared_distance = 1.0 * sum / trials;
        System.out.println(mean_squared_distance);

    }
}
