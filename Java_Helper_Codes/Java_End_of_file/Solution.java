package Java_Practice.Java_End_of_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int count = 0;
        while ((str = bufferedReader.readLine()) != null && str.length() != 0) {
            System.out.println(++count + " " + str);
        }
    }

}
