package simpleLinkList;

public class Link {
	private int iData;
	private Link next;

	public int getiData() {
		return iData;
	}

	public void setiData(int iData) {
		this.iData = iData;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Link(int iData) {
		super();
		this.iData = iData;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Link [iData=" + iData + ", next=" + next + "]";
	}
	
	public void displayLink(){
		System.out.println("IDATA: " + iData);
	}

}
