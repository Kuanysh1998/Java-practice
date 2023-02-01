import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DownloadExceptionTask {
    public static void main(String[] args) throws DownloadException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int count = 1001;
        while (count > 1000) {

            try {
                FileInputStream f = new FileInputStream(buff.readLine());
                count = f.available();
                f.close();
                System.out.println("ошибка");
                if (count < 1000) {
                    throw new DownloadException();
                }
            } catch (Exception e) {
            }


        }
    }

    public static class DownloadException extends Exception {

    }
}
