package Java_Helper_Codes;

import java.util.LinkedHashMap;
import java.util.*;
//This program keeps the frequency of each word in a map.
//and then SORTS them upon the value.
public class CountOccurenceOfWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Charecter Sequence");
		HashMap<String ,Integer> charecterMap = new HashMap<>();
		String s = input.nextLine();
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			String s2 = String.valueOf(c);
			Integer value1;
			if(charecterMap.containsKey(s2)){
				value1 = charecterMap.get(s2);
				value1++;
				charecterMap.put(s2, value1);
			}
			else
				charecterMap.put(s2,1);
		}
		Map sortedMap = sortByValue(charecterMap);
		System.out.println(sortedMap);
	}
	public static Map sortByValue(Map unsortedMap) {
		Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}
}

class ValueComparator implements Comparator {
	Map map;
 
	public ValueComparator(Map map) {
		this.map = map;
	}
 
	public int compare(Object keyA, Object keyB) {
		Comparable valueA = (Comparable) map.get(keyA);
		Comparable valueB = (Comparable) map.get(keyB);
		return valueB.compareTo(valueA);
	}
}