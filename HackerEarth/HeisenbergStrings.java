package HackerEarth;

/*

The Problem Statement :

    Heisenberg is very fond of mixing various strings together. But he has storage problem. He wants that his strings use as less space as possible.

    He has N strings right now. He wants to store them together. To reduce space he can use this property of mixing two strings:

    Suppose he has string A="abcdef" and B="cdefghi". He can mix them to form "abcdefghi".

    So, two strings can be mixed if some substring at the end of A is also at the starting of B which are mixed together.

    Given the list of strings he has right now, print the minimum final characters he can get if he can mix any number of times, any of the given strings or the intermediate strings.

Input:

    First line contains N, the number of strings. Next N line contains, one string per line.

Output:

    Print in one line the minimum final characters he can get if he can mix any number of times, any of the given strings or the intermediate strings.


 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HeisenbergStrings {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int T = input.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int testCase = 0; testCase < T; testCase++) {
            list.add(input.next());
        }

        HashSet<Character> hashSet = new HashSet<>();

        for (String s : list) {
            for (Character c : s.toCharArray()) {
                hashSet.add(c);
            }
        }

        System.out.println(hashSet.size());

    }
}
