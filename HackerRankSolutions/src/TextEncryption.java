import java.util.Scanner;

public class TextEncryption {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		String s = input.nextLine();
		String newS = s.replaceAll("\\s","");
		long L = newS.length();
		double col = Math.ceil(Math.sqrt(L));
		double low = Math.floor(Math.sqrt(L));
		String ans = "";
		int i = 0;
		while(i < col){
			if(i >= L)
				break;
			int temp = i;
			while(true){
				if(i >= L)
					break;
				char c = newS.charAt(i);
				ans += c;
				i += col;
			}
			i = temp + 1;
			ans += ' ';
		}
		System.out.println(ans);
	}
}