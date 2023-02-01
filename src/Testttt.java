public class Testttt {
    public static void main(String[] args) {
        int a = -1;
        int b = 10;
        System.out.println(b - a);
    }

    public static int[] findDuplicates(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {

                    if (!str.contains(" " + Integer.toString(array[i]) + " ") || (!str.contains(Integer.toString(array[i]) + " ")) || (!str.contains(" " + Integer.toString(array[i]))) && i != 1) {
                        str = str + Integer.toString(array[i]) + " ";
                    }

                    if (!str.contains(Integer.toString(array[i]) + " ") && i == 1) {
                        str = str + Integer.toString(array[i]) + " ";
                    }

                }
            }
        }


        String[] ans = str.split(" ");
        int[] result = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            result[i] = Integer.parseInt(ans[i]);
        }


        return result;
    }
