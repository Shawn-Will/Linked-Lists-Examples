package stackByLinkedList;

public class LinkStack {
	private LinkList theList;

	public LinkStack() {
		theList = new LinkList();
	}

	public void push(double d) {
		theList.incertFirst(d);
	}

	public double pop() {
		return theList.deletFirst();
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	public void displayStack() {
		System.out.println("Stack --> To to Bottom");
		theList.displayList();
	}
}
