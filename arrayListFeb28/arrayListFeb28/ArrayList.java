package arrayListFeb28;

public class ArrayList {
	private Object[] array;
	private int capacity;
	private int used;
	
	public ArrayList() {
		this.capacity=10;
		this.used=0;
		array = new Object[this.capacity];
	}
	
	public ArrayList(int capacity) {
		this.capacity=capacity;
		this.used=0;
		array = new Object[this.capacity];
	}
	
	public void  add(Object element) {
		if(this.used==this.capacity) {
			resize();
		}
		array[this.used] = element;
		this.used++;
	}
	
	private void resize() {
		this.capacity = this.capacity + 2;
		Object[] temp = new Object[this.capacity];
		int index;
		
		for(index=0;index<this.used;index++) {
			temp[index] = array[index];
		}
		array = temp;
	}
	
	public Object get(int index) {
		return array[index];
	}
	
	public int size() {
		return this.used;
	}
	
	public void status() {
		System.out.printf("Capacity: %d\n",this.capacity);
		System.out.printf("Used:     %d\n",this.used);
		
	}
}
