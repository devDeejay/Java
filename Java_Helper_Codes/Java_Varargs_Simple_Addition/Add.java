package Java_Practice.Java_Varargs_Simple_Addition;

public class Add {
    public void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("" + n1 + "+" + n2 + "=" + sum);
    }

    public void add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        System.out.println("" + n1 + "+" + n2 + "+" + n3 + "=" + sum);
    }

    public void add(int n1, int n2, int n3, int n4, int n5) {
        int sum = n1 + n2 + n3 + n4 + n5;
        System.out.println("" + n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "=" + sum);
    }

    public void add(int n1, int n2, int n3, int n4, int n5, int n6) {
        int sum = n1 + n2 + n3 + n4 + n5 + n6;
        System.out.println("" + n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "+" + n6 + "=" + sum);
    }
}
