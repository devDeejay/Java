import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		StringBuilder rev = new StringBuilder(s);
		System.out.println(rev.reverse().toString());
	}

}
