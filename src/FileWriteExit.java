import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteExit {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        FileWriter fw = new FileWriter(s.nextLine());
        BufferedWriter buff = new BufferedWriter(fw);
        String str = "";
        while (!(str.equals("exit"))) {
            str = s.nextLine();
            buff.write(str, 0, str.length());
            buff.newLine();
        }
        
        buff.close();
    }
}
