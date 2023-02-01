import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerSecond {
    public static void main(String[] args) {
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\UMAG\\Desktop\\asc.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\UMAG\\Desktop\\asc.txt");

            JavaRush javaRush = new JavaRush();
            User test = new User();
            test.setFirstName("Kuanysh");
            test.setLastName("Koshpanov");
            test.setBirthDate(new Date(484848445L));
            test.setMale(true);
            test.setCountry(User.Country.UKRAINE);
            javaRush.users.add(test);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            writer.write(Integer.toString(users.size()));
            writer.write("\n");
            writer.write(users.get(0).getFirstName());
            writer.write("\n");
            writer.write(users.get(0).getLastName());
            writer.write("\n");
            long d = users.get(0).getBirthDate().getTime();
            writer.write(Long.toString(d));
            writer.write("\n");
            writer.write(Boolean.toString(users.get(0).isMale()));
            writer.write("\n");
            writer.write(users.get(0).getCountry().getDisplayName());
            writer.close();

        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            reader.readLine();
            User user = new User();
            user.setFirstName(reader.readLine());
            user.setLastName(reader.readLine());
            user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
            user.setMale(Boolean.parseBoolean(reader.readLine()));

            String str = reader.readLine();
            if (str.equals("Ukraine")) user.setCountry(User.Country.UKRAINE);
            if (str.equals("Russia")) user.setCountry(User.Country.RUSSIA);
            if (str.equals("Other")) user.setCountry(User.Country.OTHER);

            this.users.add(user);

            reader.close();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
