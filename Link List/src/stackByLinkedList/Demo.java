package stackByLinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkStack theStack = new LinkStack();
		
		System.out.println(theStack.isEmpty());
		
		theStack.push(2.22);
		theStack.push(3.33);
		theStack.push(4.44);
		theStack.push(5.55);
		theStack.push(6.66);
		theStack.push(7.77);
		
		theStack.displayStack();
		
		theStack.pop();
		theStack.pop();
		
		theStack.displayStack();

		System.out.println(theStack.isEmpty());
	}

}
