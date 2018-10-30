package HackerEarth;

public class HarryPotterSpiders {
    public static void main(String[] args) {
        callFunction(5);
    }

    private static void callFunction(int value) {
        if (value == 1) {
            System.out.println("done");
        }
        else {
            callFunction(--value);
        }
    }
}
