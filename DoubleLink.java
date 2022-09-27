class DoubleLink {

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

	void inser_first(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			last = newnode;
		} else {
			newnode.next = head;
			head = newnode;
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

	void deleteNode(int value) {

		Node temp = head;
		if (temp == null) {
			System.out.println("Empty that nor delete");
		} else if (value == temp.data) {

			temp = temp.next;
			temp.prev = null;
			displaynode();

		} else if (value == temp.next.data) {
			temp.prev.next=temp.next;
			temp.next.prev = temp.prev;
			displaynode();
		}

		else {
			while (temp.data != value && temp != null) {
				temp = temp.next;
			}
			temp.prev.next = temp.next;
			temp.next = temp.prev.next;
			temp = temp.next;
			displaynode();
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
		obj.inser_first(1);

		obj.displaynode();
		System.out.println("");
		obj.deleteNode(20);
	}
}
