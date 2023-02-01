import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class testDouble {
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        HashMap<Integer, Integer> asciis = new HashMap<>();

        for (int i = 0; i < 128; i++) {
            asciis.put(i, 0);
        }

        while (input.available() > 0) {
            int current = input.read();
            int value = asciis.get(current) + 1;
            asciis.put(current, value);
        }

        for (int i = 0; i < 128; i++) {
            System.out.println((char) i + " " + asciis.get(i));
        }

        input.close();
    }
}
