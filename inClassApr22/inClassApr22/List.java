package inClassApr22;

public class List {
	private Node head;
	
	public List() {
		this.head=null;
	}
	
	public void add(String value) {
		Node temp = head;
		Node newNode = new Node(value,null);
		
		if(head==null) {
			head=newNode;
		}else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void show(){
		Node temp = head;
		
		if(temp==null) {
			System.out.printf("(Empty List)\n");
		}
		while(temp!=null) {
			System.out.printf("%s\n", temp.value);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		List list1 = new List();
		
		list1.show();
		
		list1.add("Bill");
		list1.add("Mary");
		list1.add("Joe");
		
		list1.show();
		
	}

}
