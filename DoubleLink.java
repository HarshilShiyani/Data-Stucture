class DoubleLink{

	class Node {

		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public Node head = null;
	public Node last = null;

	void insert_in_doubly(int data) {

		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			last = newnode;
		} else {
			last.next = newnode;
			newnode.prev = last;
			last = newnode;
		}
	}

	void displaynode() {
		Node current = head;
		if (head == null) {
			System.out.print("Empty");

		} else {
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
	}

}

class DoubleLinkDemo {
	public static void main(String[] args) {

		DoubleLink obj = new DoubleLink();
		obj.insert_in_doubly(10);
		obj.insert_in_doubly(20);
		obj.insert_in_doubly(30);
		obj.insert_in_doubly(40);
		obj.insert_in_doubly(80);
		obj.displaynode();
		//System.out.print(" Prev=" + obj.last.prev.prev.next.prev.prev.data);

	}
}
