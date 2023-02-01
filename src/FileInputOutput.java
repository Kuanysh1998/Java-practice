import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileInputOutput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String path1 = s.nextLine();
        String path2 = s.nextLine();

        FileInputStream input = new FileInputStream(path1);
        FileOutputStream output = new FileOutputStream(path2);

        byte[] buffer = input.readAllBytes();

        for (int i = 0; i < buffer.length; i = i + 2) {
            byte temp = buffer[i];
            buffer[i] = buffer[i + 1];
            buffer[i + 1] = temp;

        }
        output.write(buffer);
    }
}
