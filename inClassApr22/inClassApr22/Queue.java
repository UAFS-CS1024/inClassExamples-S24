package inClassApr22;

public class Queue extends List{
	
	public Queue() {
		
	}
	
	public void enqueue(String str) {
		this.add(str);
	}
	
	public String dequeue() {
		return this.pop();
	}
}
