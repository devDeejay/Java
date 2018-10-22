package Java;

import Java.Result;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Result r1 = new Result("DJ", 23);
        Result r2 = new Result("PJ", 24);
        Result r3 = new Result("CJ", 25);
        Result r4 = new Result("TJ", 23);

        ArrayList<Result> list = new ArrayList<>();

        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r3);
        if (list.contains(r3)) {
            list.remove(r3);
        }

        for (Result r : list) {
            System.out.println(r.name);
        }
    }
}
