package Java.Data_Structures.Graphs;

import java.util.ArrayList;

public class Bag<Integer> {

    private ArrayList<Integer> list;

    public Bag(){
        list = new ArrayList<>();
    }

    void add (Integer n) {
        list.add(n);
    }

    Integer get () {
        if (list.size() > 0) {
            return list.remove(list.size() - 1);
        }
        else return null;
    }

    ArrayList<Integer> getList() {
        return list;
    }
}
