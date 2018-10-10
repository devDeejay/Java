package Java_Practice.JavaCurrencyFormatter;

import javax.swing.text.NumberFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Double payment = Double.valueOf(bufferedReader.readLine());

        String us, india, china, france;

        double amount = payment;

        NumberFormat currencyFormatter;
        Locale locale = null;

        locale = new Locale("en", "US");
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        us = currencyFormatter.format(amount);

        // For France

        locale = new Locale("en", "IN");
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        india = currencyFormatter.format(amount);

        // For China

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);

        china = currencyFormatter.format(amount);

        // For France

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        france = currencyFormatter.format(amount);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
