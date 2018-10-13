public class Test {
    public static void main(String[] args) {
        Test n = new Test(2);
    }

    Test(int x) {
        switch ( x % 2) {
            case 0 :
                System.out.println("odd");
                break;
            case 1:
                System.out.println("eve");
                break;
        }
    }
}
