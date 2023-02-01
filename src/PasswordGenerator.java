import java.io.ByteArrayOutputStream;

public class PasswordGenerator {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String str = "";
        byte[] upperLetters = new byte[26];
        byte[] lowerLetters = new byte[26];
        byte[] digits = new byte[10];
        int index = 0;
        int index2 = 0;
        int index3 = 0;
        for (int i = 65; i <= 90; i++) {
            upperLetters[index] = (byte) i;
            index++;
        }

        for (int i = 97; i <= 122; i++) {
            lowerLetters[index2] = (byte) i;
            index2++;
        }

        for (int i = 48; i <= 57; i++) {
            digits[index3] = (byte) i;
            index3++;
        }

        byte[] finalPassword = new byte[8];
        finalPassword[0] = upperLetters[(int) (Math.random() * 26)];
        finalPassword[1] = lowerLetters[(int) (Math.random() * 26)];
        finalPassword[2] = digits[(int) (Math.random() * 10)];
        for (int i = 3; i < 8; i++) {
            int rolledNum = (int) (Math.random() * 100);
            if (rolledNum < 33) {
                finalPassword[i] = upperLetters[(int) (Math.random() * 26)];
            }

            if (rolledNum >= 33 && rolledNum < 66) {
                finalPassword[i] = lowerLetters[(int) (Math.random() * 26)];
            }

            if (rolledNum >= 66) {
                finalPassword[i] = digits[(int) (Math.random() * 10)];
            }


        }
        try {
            bos.write(finalPassword);
        } catch (Exception e) {

        }
        return bos;
    }

}
