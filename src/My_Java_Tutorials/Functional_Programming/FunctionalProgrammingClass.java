package Functional_Programming;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FunctionalProgrammingClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("My");
        list.add("Name");
        list.add("Is");
        list.add("DJ");

        /*
         * To print, Imperatively, we have to define on how to do it :
         * We have to tell how to iterate over this list and how to print
         * */

        for (String item : list) {
            System.out.print(item + " ");
        }

        System.out.println();

        /*
        * Functional Style you just have to tell, that you want to iterate and print
        * We don't have to tell how to iterate
        * */

        list.forEach(new Consumer<String>() { // The consumer we are passing here is a Functional Interface
            @Override
            public void accept(String s) { // Just a consumer method
                System.out.print(s + " ");
            }
        });

        // A method that takes a Function as a parameter is known as a High-Order Function

        /*
        * That looks quite ugly right? So let's see how we can make this better
        * IDE is suggesting to replace the expression with a Lambda Expression
        * Let's take a look
        * */

        list.forEach((String item) -> {
            System.out.print(item);
        });

        // Wait, this gets better
        // Since, there is only one line inside the {} of the function, we can simple declare it like that
        list.forEach((String item) -> System.out.print(item) );

        // Hey, it still is getting better
        // For single input
        list.forEach(item -> System.out.print(item));

        // And then look at this thing man :(
        list.forEach(System.out::print);
    }
}
