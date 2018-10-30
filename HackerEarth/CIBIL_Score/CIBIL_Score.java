package CIBIL_Score;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class CIBIL_Score {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        runTheProgram();
    }

    private static void runTheProgram() {

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Sam", 20, 180));
        personArrayList.add(new Person("Mike", 27, 170));
        personArrayList.add(new Person("Rob", 29, 160));
        personArrayList.add(new Person("Jack", 29, 190));
        personArrayList.add(new Person("Bob", 21, 170));
        personArrayList.add(new Person("Bean", 21, 176));
        personArrayList.add(new Person("Bob", 21, 170));
        personArrayList.add(new Person("Jim", 30, 160));
        personArrayList.add(new Person("Jimmy", 30, 160));

        personArrayList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getAge() > p2.getAge()) {
                    // Return positive value if first Object is greater than second
                    return 1;
                } else if (p1.getAge() < p2.getAge()) {
                    // Return negative value if second Object is greater than first
                    return -1;
                }

                // Check For Heights
                else {
                    if (p1.getHeight() < p2.getHeight()) {
                        // Since the one with lower height has to be shifted i.e. return 1 i.e for person 1
                        return 1;
                    } else if (p1.getHeight() > p2.getHeight()) {
                        // Else person 2 will have to move
                        return -1;
                    } else {
                        // Age and height both are same
                        // Check for names now

                        if (p1.getName().charAt(0) < p2.getName().charAt(0)) {
                            // Sorting Names Alphabetically
                            return 1;
                        } else if (p1.getName().charAt(0) < p2.getName().charAt(0)) {
                            return -1;
                        } else {
                            // Age, Height and Names are all same
                            // Hence, do nothing
                            return 0;
                        }

                    }
                }
            }
        });

        System.out.println("   Age   :   Height   :    Name    ");
        Iterator<Person> iterator = personArrayList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println("   " + p.getAge() + "    :    " + p.getHeight() + "     :    " + p.getName());
        }
    }
}

