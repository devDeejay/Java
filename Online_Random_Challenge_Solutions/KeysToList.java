package programs;
import java.util.*;
public class KeysToList {

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(5,1);
		hashMap.put(4,2);
		hashMap.put(3,3);
		hashMap.put(2,4);
		hashMap.put(1,5); 
		hashMap.put(0,6);
		hashMap.put(6,7);
		
		ArrayList<Integer> keys = new ArrayList<>(hashMap.keySet());
		System.out.println(keys);
		
		ArrayList<Integer> values = new ArrayList<>(hashMap.values());
		System.out.println(values);
		
		System.out.println(hashMap.containsKey(8));
		System.out.println(hashMap.containsKey(1));
		System.out.println(hashMap.containsKey(2));
		
		
	}

}
