import java.util.*;

public class SetListPerformance {
	static final int N = 1000000;
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++)
			list.add(i);
		
		Collections.shuffle(list);
		
		Collection<Integer> set1 = new HashSet<>(list);
		System.out.println("Member test time for hash set is " + getTestTime(set1) + " milliseconds.");
		System.out.println("Remove elements time for hash set is " + getRemoveTime(set1) + " milliseconds.");
		System.out.println();
		Collection<Integer> set2 = new HashSet<>(list);
		System.out.println("Member test time for linked set is " + getTestTime(set2) + " milliseconds.");
		System.out.println("Remove elements time for linked set is " + getRemoveTime(set2) + " milliseconds.");
		System.out.println();
		Collection<Integer> set3 = new HashSet<>(list);
		System.out.println("Member test time for tree set is " + getTestTime(set3) + " milliseconds.");
		System.out.println("Remove elements time for tree set is " + getRemoveTime(set3) + " milliseconds.");
		System.out.println();
		Collection<Integer> list1 = new HashSet<>(list);
		System.out.println("Member test time for array list is " + getTestTime(list1) + " milliseconds.");
		System.out.println("Remove elements time for array list is " + getRemoveTime(list1) + " milliseconds.");
		System.out.println();
		Collection<Integer> list2 = new HashSet<>(list);
		System.out.println("Member test time for linked list is " + getTestTime(list2) + " milliseconds.");
		System.out.println("Remove elements time for linked list is " + getRemoveTime(list2) + " milliseconds.");
	}
	private static long getRemoveTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis(); 
		
		for (int i = 0; i < N; i++)
			c.remove(i); 
		
		return System.currentTimeMillis() - startTime;
	}
	private static long getTestTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < N; i++) 
			c.contains((int)(Math.random() * 2 * N));
		
		return System.currentTimeMillis() - startTime;
	}
}
