package stackByLinkedList;

public class LinkList {
	private Link first;

	public boolean isEmpty() {
		return first == null;
	}

	public void incertFirst(double dd) {
		Link newLink = new Link(dd);
		newLink.next = first;
		first = newLink;
	}

	public double deletFirst() {
		Link temp = first;
		first = first.next;
		return temp.dData;
	}

	public void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
