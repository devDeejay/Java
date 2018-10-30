package Java.Data_Structures.Others;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(20, 3.99);
		theList.insertFirst(40, 3.99);
		theList.insertFirst(50, 2.99);
		theList.insertFirst(20, 3.99);
		theList.insertFirst(10, 1.99);
		theList.insertFirst(40, 3.99);
		
		theList.displayList();
		
		while( !theList.isEmpty()){
			Link aLink = theList.deleteFirst();
			aLink.displayLink();
			System.out.println("");
		}
		
	}

}
