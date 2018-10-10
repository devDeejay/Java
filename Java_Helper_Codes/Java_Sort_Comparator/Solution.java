package Java_Practice.Java_Sort_Comparator;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, (o1, o2) -> {
            if (o1.getCgpa() != o2.getCgpa()) {
                double diff = (o2.getCgpa() - o1.getCgpa());
                return (diff > 0 ? 1 : -1);
            }
            else if( !(o1.getFname().equals(o2.getFname() )) ) {
                return o1.getFname().compareTo(o2.getFname());
            }
            else {
                return o1.getId() - o2.getId();
            }
        });


        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}



