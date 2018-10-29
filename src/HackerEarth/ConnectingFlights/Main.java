package ConnectingFlights;

class Animals {
    private Animals(){
    }
    private Animals(int a, int b) {
    }
}


class Main {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        System.out.println(a);

        int b = a - 1;
        System.out.println(b == Integer.MAX_VALUE);
    }
}