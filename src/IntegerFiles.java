import java.io.*;
import java.util.ArrayList;


public class IntegerFiles {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = buff.readLine();
        String fileName2 = buff.readLine();
        buff.close();
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()) {
            String x = reader.readLine();
            list.add(x);

        }

        for (String s : list) {
            String[] arr = s.split(" ");
        }


        reader.close();
        writer.close();

    }
}
