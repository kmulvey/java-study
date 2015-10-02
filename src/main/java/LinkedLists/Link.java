package LinkedLists;

public class Link {
	String bookName;
	int numSold;
	Link next;

	Link(String name, int num) {
		this.bookName = name;
		this.numSold = num;
	}

	public void display() {
		System.out.println(bookName + ": " + numSold);
	}
	
	public String toString(){
		return this.bookName;
	}
}
