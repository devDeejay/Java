package TechgigPalindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TechgigPalindrome {

    static HashMap<Character, Integer> charCounter = new HashMap<>();
    static int count = 0;
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {

            int size = Integer.parseInt(bufferedReader.readLine());
            String inputString = bufferedReader.readLine();
            int numberOfChars = inputString.length();

            createAHashMapOfCharacters(inputString);

            ArrayList<Integer> valuesCount = new ArrayList<>();

            for (Character c : charCounter.keySet()) {
                valuesCount.add(charCounter.get(c));
            }


            Iterator<Integer> iterator = valuesCount.iterator();

            while (iterator.hasNext()) {
                int i = iterator.next();
                if ((i % 2) == 1) {
                    count++;
                }
            }

            if (numberOfChars % 2 == 0) {
                System.out.println(count);
            } else if (count == 0) {
                System.out.println(count);
            } else {
                System.out.println(count - 1);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void createAHashMapOfCharacters(String inputString) {
        for (char c : inputString.toCharArray()) {
            if (charCounter.containsKey(c)) {
                charCounter.put(c, charCounter.get(c) + 1);
            } else {
                charCounter.put(c, 1);
            }
        }
    }
}
