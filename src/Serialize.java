import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Serialize {
    public static void main(String[] args) throws Exception {


        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\UMAG\\Desktop\\asc.txt"));
        osw.write("Dafda");
        osw.write("\n");
        osw.write("7");
        osw.close();


    }
}
