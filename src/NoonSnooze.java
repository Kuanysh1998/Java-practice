public class NoonSnooze {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String amOrPm = "pm";
        int counter = 0;
        while (n > 720) {
            n = n - 720;
            counter++;
        }
        int hours = n / 60;
        int minutes = n % 60;
        if (hours == 0) hours = 12;
        if (counter % 2 != 0) amOrPm = "am";


        System.out.println(hours + " :" + minutes + amOrPm);
    }
}
