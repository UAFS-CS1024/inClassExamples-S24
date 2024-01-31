package inclassJan29;

import java.util.Random;

public class Prob {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int status;
		
		// Comment
		status=loadRandomArray(numbers,-5,-7);
		if(status==1) {
			System.out.printf("Error; Max is less than or equal to Min\n");
		}
		showArray(numbers);

	}
	
	public static void loadRandomArray(int[] array) {
		int index;
		
		Random rand = new Random();
		  for(index=0;index<array.length;index++) {
			  array[index]=rand.nextInt(100);
		  }
	}
	
	public static int loadRandomArray(int[] array, int min, int max) {
		int index;
		int retval=0;
		
		if(max<=min) {
			retval=1;  //max less than - min
		}else {
			Random rand = new Random();
			  for(index=0;index<array.length;index++) {
				  array[index]=rand.nextInt(max-min+1) + min;
			  }
		}
		  return retval;
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
