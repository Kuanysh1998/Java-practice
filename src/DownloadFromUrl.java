import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class DownloadFromUrl {
    public static void main(String[] args) throws Exception {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        InputStream stream = url.openStream();

        String[] spl = urlString.split("/");
        String name1 = spl[spl.length - 1];

        String[] spl2 = name1.split("\\.");

        String type = "." + spl2[1];
        Path tempFile = Files.createTempFile(null, null);
        Files.copy(stream, tempFile, REPLACE_EXISTING);
        System.out.println(spl2[0]);
        System.out.println(type);
        return Files.move(tempFile, Paths.get(downloadDirectory.toString() + name1), REPLACE_EXISTING);

    }
}
