import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int[] test = Arrays.copyOf(heights, heights.length);
        Arrays.sort(test);
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }
       
    }
}
