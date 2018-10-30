package EntryptedMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dec {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String encryptedMessage = bufferedReader.readLine();

        String message = decryptMessage(encryptedMessage);

        System.out.println(message);

    }

    private static String decryptMessage(String inputMessage) {

        StringBuilder decryptedMessage = new StringBuilder();

        //Getting Keys
        String keyString = inputMessage.split("%%%%")[0];
        String encryptedMessage = inputMessage.split("%%%%")[1];
        String[] keyStringArray = keyString.split("#");

        for (int i = 0; i < keyStringArray.length; i++) {
            char c = encryptedMessage.charAt(i);
            int offset = Integer.valueOf(keyStringArray[i]);
            offset = (offset >> 7);

            int currentIndex = c;
            int newIndex = currentIndex - offset;

            decryptedMessage.append((char)(newIndex));

        }

        return decryptedMessage.toString().toLowerCase();

    }

}
