public class testesfs {
    public static void main(String[] args) {
        
    }

    public static int countLeapYear(int n) {
        int i = 0;
        int counter = 0;
        while (i < n) {

            if (i % 400 == 0) counter++;
            if (i % 100 == 0) {
                i++;
                continue;
            }
            if (i % 4 == 0) counter++;
            i++;
        }

        return counter;
    }

}
