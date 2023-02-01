public class RollDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] tab = new String[61];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int dice = (int) (Math.random() * 6 + 1);
                sum = sum + dice;

            }
            tab[sum] = tab[sum] + "*";

        }
        for (int i = 10; i <= tab.length; i++) {
            System.out.println(i + ":" + tab[i]);
        }

    }
}
