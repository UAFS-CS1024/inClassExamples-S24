package inClassApr22;

public class List {
	protected Node head;
	
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
	
	public void remove(String value) {
		Node temp = head;
		
		if(temp.value.equals(value)) {
			temp = temp.next;
			head = temp;
		}else {
			while(temp.next!=null) {
				if(temp.next.value.equals(value)) {
					temp.next=temp.next.next;
					break;
				}
				temp=temp.next;
			}
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
		System.out.println();
	}
	
	public String pop(){
		String value=null;

		if(this.head!=null) {
			value = this.head.value;
			this.head = this.head.next;
		}
		
		return value;
	}

	public static void main(String[] args) {
				
		//** Test List ***
		System.out.println("***********List Test*******");
		List list1 = new List();
		list1.add("Bill");
		list1.add("Mary");
		list1.add("Joe");
		list1.show();
		list1.remove("Mary");
		list1.show();
		
		//** Test Stack ****
		System.out.println("***********Stack Test*******");
		Stack stack1 = new Stack();
		stack1.push("Jim");
		stack1.push("Jack");
		stack1.push("Jasmine");
		stack1.push("Joey");
		stack1.push("Jill");
		stack1.show();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.show();
		
		//** Test Queue ****
		System.out.println("***********Queue Test*******");
		Queue queue1 = new Queue();
		queue1.enqueue("Jim");
		queue1.enqueue("Jack");
		queue1.enqueue("Jasmine");
		queue1.enqueue("Joey");
		queue1.enqueue("Jill");
		queue1.show();
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.show();
	}

}
