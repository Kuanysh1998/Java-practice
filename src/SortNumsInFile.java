import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumsInFile {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        FileInputStream input = new FileInputStream(s.nextLine());

        while (input.available() > 0) {
            int num = input.read();
            Integer a = new Integer(num);
            byte b = a.byteValue();
            char ch = (char) b;
            int numeric = Character.getNumericValue(ch);


            if (numeric % 2 == 0) {
                list.add(numeric);
            }

        }

        Collections.sort(list);
        for (int x : list) {
            System.out.println(x);
        }
    }
}
