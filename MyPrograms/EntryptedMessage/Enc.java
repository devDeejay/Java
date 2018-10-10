package EntryptedMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Enc {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String message = bufferedReader.readLine().trim();

        String encryptedMessage = encryptMessage(message.toUpperCase());
        System.out.println(encryptedMessage);
    }

    private static String encryptMessage(String inputMessage) {

        StringBuilder encryptionKey = new StringBuilder();
        StringBuilder encryptedMessage = new StringBuilder();
        int low, high, offset, index, newIndex;
        char newChar;

        for (char c : inputMessage.toCharArray()) {
            Random random = new Random();
            low = 1;
            high = 10;
            offset = random.nextInt(high - low) + low;

            index = c;
            newIndex = index + offset;
            newChar = (char) newIndex;

            encryptionKey.append((offset << 7) + "#");
            encryptedMessage.append(newChar);

        }

        encryptionKey.deleteCharAt(encryptionKey.length() - 1);

        return encryptionKey + "%%%%" + encryptedMessage;
    }
}
