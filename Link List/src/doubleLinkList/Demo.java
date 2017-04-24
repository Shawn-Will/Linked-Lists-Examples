package doubleLinkList;

public class Demo {

	public static void main(String[] args) {
		FirstLastList theList = new FirstLastList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.displayForward();
		theList.displayBackword();
		
		theList.deleteFirst();
		theList.deleteKey(11);
		theList.deleteLast();
		
		theList.displayForward();

	}

}
