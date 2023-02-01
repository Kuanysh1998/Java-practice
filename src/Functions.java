public class Functions {
    public static int findMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static int findMedian(int[] a) {
        int median = (int) (a.length / 2);
        return a[median];
    }

    public static int findFrequently(int[] a) {
        int max = Functions.findMax(a);
        int[] all = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            all[a[i]]++;
        }
        int allMax = Functions.findMax(all);
        int answer = 0;
        for (int i = 0; i < all.length; i++) {
            if (allMax == all[i]) answer = i;
        }
        return answer;

    }

    public static int sumOfSquares(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * a[i];
        }
        return sum;
    }

    public static int Average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        int[] array = {100, 20, 30, 50, 50, 60, 70, 50, 90, 100};
        int answer = Functions.Average(array);
        System.out.println(answer);
    }

}
