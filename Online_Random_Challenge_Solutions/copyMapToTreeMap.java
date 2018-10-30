package programs;
import java.util.*;
public class copyMapToTreeMap {

	public static void main(String[] args) {

		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(2, 1);
		map.put(3, 1);
		map.put(4, 1);
		map.put(5, 1);
		
		TreeMap<Integer,Integer> treeMap = new TreeMap<>(map);
		System.out.println(treeMap);
	}

}
