public class Students {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        String[] names = new String[n];
        String[] surnames = new String[n];
        String[] emails = new String[n];
        int[] sections = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = StdIn.readString();
            surnames[i] = StdIn.readString();
            emails[i] = StdIn.readString();
            sections[i] = StdIn.readInt();
        }
        for (int i = 0; i < sections.length; i++) {
            if (sections[i] == 4 || sections[i] == 7) {
                StdOut.println("name: " + names[i] + ", surname: " + surnames[i] + ", email: " + emails[i] + ", " + sections[i]);
            }
        }
    }
}
