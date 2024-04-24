package inClassApr22;

public class Stack extends List{
	
	public Stack() {
		
	}
	
	public void push(String str){
		Node newNode = new Node(str,null);
		newNode.next = this.head;
		this.head = newNode;
	}
	

}
