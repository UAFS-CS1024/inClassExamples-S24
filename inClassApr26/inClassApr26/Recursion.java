package inClassApr26;

public class Recursion {

	public static void main(String[] args) {
		int index=0;
		int[] numbers= {10,20,30,40,50,60,70,80,90,100};
		
		count(index,numbers);

	}
	
	public static void count(int index, int[] array) {
		
		if(index==10) {
			return;
		}

		System.out.printf("[%d]: %d\n",index,array[index]);
		index++;
		count(index,array);			
	}

}
