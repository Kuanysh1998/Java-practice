public class KickBoxer {
    public static void main(String[] args) {
        int[] weights = {112, 115, 118, 122, 126, 130, 135, 140, 147, 154, 160, 167, 174, 183, 189, 198, 209, 9999};
        String[] weight_class = {"Fly Weight", "Super Fly Weight", "Bantam Weight", "Super Bantam Weight", "Feather Weight",
                "Super Feather Weight", "Light Weight", "Super Light Weight", "Welter Weight", "Super Welter Weight", "Middle Weight",
                "Super Middle Weight", "Light Heavy Weight", "Duper Light Heavy Weight", "Cruiser Weight", "Super Cruiser Weight",
                "Heavy Weight", "Super Heavy Weight"};
        int weight = Integer.parseInt(args[0]);
        int i = 0;
        while (weight > weights[i]) {
            i++;
        }
        System.out.println(weight + " " + weight_class[i]);
    }


}
