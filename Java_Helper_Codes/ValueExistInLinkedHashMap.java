package programs;
import java.util.*;
public class ValueExistInLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> linkedhm = new LinkedHashMap<>();
		linkedhm.put(2,4);
		System.out.println((linkedhm.containsValue(3)));
		System.out.println((linkedhm.containsValue(4)));
	}
}
