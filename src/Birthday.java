public class Birthday {
    public static void main(String[] args) {
        //int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        //int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        int counter = 0;
        String[] birthdays = new String[10000];
        for (int i = 0; i < birthdays.length; i++) {
            int birthM = (int) (Math.random() * 12 + 1);
            if (birthM == 1 || birthM == 3 || birthM == 5 || birthM == 7 || birthM == 8 || birthM == 10 || birthM == 12) {
                int birthD = (int) (Math.random() * 31 + 1);
                String full = birthM + "/" + birthD;
                birthdays[i] = full;
            }
            if (birthM == 2) {
                int birthD = (int) (Math.random() * 28 + 1);
                String full = birthM + "/" + birthD;
                birthdays[i] = full;
            } else {
                int birthD = (int) (Math.random() * 30 + 1);
                String full = birthM + "/" + birthD;
                birthdays[i] = full;
            }


        }

        for (int i = 0; i < birthdays.length; i++) {
            System.out.println(birthdays[i]);
        }


    }


}

