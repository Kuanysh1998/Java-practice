public class TestRandom {
    public static void main(String[] args) {
        int n = 1234567891;

        int counter = 0;
        int num = n;
        if (n >= 1000) {
            while (num >= 1000) {
                num = num / 1000;
                counter++;
            }
        }

        String[] arr = new String[Integer.toString(n).length() + counter];
        int index = arr.length - 1;
        for (int i = 0; i < counter; i++) {
            arr[index - 3] = ".";
            index = index - 4;
        }

        for (int i = 0; i < Integer.toString(n).length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == null) {
                    arr[j] = Character.toString((Integer.toString(n).charAt(i)));
                    break;

                }
            }
        }

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }

        System.out.println(ans);
    }
}
