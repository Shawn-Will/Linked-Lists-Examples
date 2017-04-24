package doubleLinkList;

public class FirstLastList {
	public Link first;
	public Link last;

	public FirstLastList() {
		first = null;
		last = null;

	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long dData) {
		Link newlink = new Link(dData);
		if (isEmpty()) {
			last = newlink;
		} else {
			first.previous = newlink;
		}
		newlink.next = first;
		first = newlink;
	}

	public void insertLast(long dData) {
		Link newLink = new Link(dData);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public Link deleteLast() {
		Link temp = last;
		if (last.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean incertAfter(long key, long dData) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Link newLink = new Link(dData);
		if (current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}

		newLink.previous = current;
		current.next = newLink;
		return true;
	}

	public Link deleteKey(long key) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}

		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}

		return current;
	}

	public void displayForward() {
		System.out.println("List <First --> Last>: ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("\n");
	}

	public void displayBackword() {
		System.out.println("List <Last --> First>: ");
		Link current = last;
		while (current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
	}

	public boolean incertBefore(Long key, long dData) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		Link newLink = new Link(dData);
		if (current == first) {
			newLink.next = first;
			first.previous = newLink;
			first = newLink;
		} else {
			newLink.next = current;
			current.previous.next = newLink;
			newLink.previous = current.previous;
			current.previous = newLink;
		}
		
		return true;
	}

}
