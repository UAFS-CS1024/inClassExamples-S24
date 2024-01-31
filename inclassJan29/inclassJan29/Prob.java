package inclassJan29;

import java.util.Random;

public class Prob {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		// Comment
		loadRandomArray(numbers);
		showArray(numbers);

	}
	
	public static void loadRandomArray(int[] array) {
		int index;
		
		Random rand = new Random();
		  for(index=0;index<array.length;index++) {
			  array[index]=rand.nextInt(100);
		  }
	}
	
	public static void showArray(int[] array) {
		int index;
		
		  System.out.printf("[");
		  for(index=0;index<array.length;index++) {
			  if(index!=0) {
				  System.out.printf(",");
			  }
			  System.out.printf("%d", array[index]);
		  }
		  System.out.printf("]\n");
	}

}
