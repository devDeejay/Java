package Java_Practice.DateToDay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] num = bufferedReader.readLine().split(" ");

        String day = num[0];
        String month = num[1];
        String year = num[2];

        System.out.println(getDayOfWeek(day, month, year));

    }

    private static String getDayOfWeek(String day, String month, String year) {
        return LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day)).getDayOfWeek().name();
    }

}
