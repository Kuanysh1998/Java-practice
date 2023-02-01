public class IterPrime {
    public static void main(String[] args) {
        char[] str = {'1', '2', '3'};

        int result = parseInt(str);

        System.out.println(result);
    }

    public static int parseInt(char[] str) {
        int[] array = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        double ans = 0;
        if (str[0] == '-') {

            int n = str.length - 1;
            for (int i = 1; i < str.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    if ((int) str[i] == array[j]) ans = ans + (j * Math.pow(10, n - i));
                }
            }

            ans = ans - (ans * 2);

        } else {
            int n = str.length;
            for (int i = 0; i < str.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    if ((int) str[i] == array[j]) ans = ans + (j * Math.pow(10, n - i - 1));
                }
            }
        }

        return (int) ans;
    }
}
