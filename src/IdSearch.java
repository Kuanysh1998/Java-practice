import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class IdSearch {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";
        try {
            fileName = buff.readLine();
        } catch (Exception e) {
        }
        String data = "";
        FileReader reader = new FileReader(fileName);

        while (reader.ready()) {
            data = data + (char) reader.read();
        }

        reader.close();
        String[] arr = data.split(" ");
        HashMap<Integer, String> products = new HashMap<>();


        int currentId = Integer.parseInt(arr[0]);
        String value = "zb";
        for (int k = 0; k < 3; k++) {

            int i = 1;


            while (arr[i].equals(Integer.toString(currentId + 1))) {
                if (i == arr.length - 1) {

                    break;
                }

                value = value + arr[i];
                i++;


            }
            products.put(currentId, value);


            currentId = currentId + 1;

        }

        int neededId = 195;
        System.out.println(products);

    }

}
