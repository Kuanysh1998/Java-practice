public class Months_array {
    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        int n = Integer.parseInt(args[0]);
        if (n > 0 && n <= 12) {
            System.out.println(months[n - 1]);
        } else System.out.println("Incorrect data");

    }
}
