package simpleLinkList;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void incertFirst(int i) {
		Link newLink = new Link(i);
		newLink.setNext(first);
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public Link find(int key) {
		Link current = first;
		while (current.getiData() != key) {
			if (current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}
		}

		return current;
	}

	public Link delete(int key){
		
	}

}
