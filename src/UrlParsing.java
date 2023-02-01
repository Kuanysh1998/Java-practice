import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UrlParsing {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        int indexQuestion = url.indexOf("?") + 1;
        int indexAnd = url.indexOf("&");

        String firstParam = url.substring(indexQuestion, indexAnd);


        ArrayList<String> list = new ArrayList<>();
        list.add(firstParam);

        String str = url.substring(indexAnd + 1, url.length());
        if (!str.contains("&") && str.contains("=")) {
            str = url.substring(indexAnd, url.length());
        }
        if (str.contains("&")) {
            String[] arr = str.split("&");
            for (String s : arr) {
                list.add(s);
            }
        }

        for (String s : list) {
            if (s.contains("=")) {
                int i = s.indexOf("=");
                System.out.print(s.substring(0, i) + " ");
            } else System.out.print(s + " ");
        }
        System.out.println();


        for (String s : list) {
            if (s.contains("obj")) {
                int i = s.indexOf("=");
                String parameter = s.substring(i + 1, s.length());

                try {
                    double x = Double.parseDouble(parameter);
                    alert(x);
                } catch (Exception e) {
                    alert(parameter);
                }


            }
        }


    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
