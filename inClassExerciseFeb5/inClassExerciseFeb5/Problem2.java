package inClassExerciseFeb5;

public class Problem2 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,15};
		int result = contentSplit(numbers);
		System.out.printf("Result: %d\n", result);
		
	}

	public static int contentSplit(int[] theArray) {
		int totalSum=0;
		int totalRun=0;
		int index;
		int result=-1;
		
		for(index=0;index<theArray.length;index++) {
			totalSum = totalSum + theArray[index];
		}
		for(index=0;index<theArray.length-1;index++) {
			totalRun = totalRun + theArray[index];
			if(totalRun == (totalSum-totalRun)) {
				result=index+1;
				break;
			}
		}	
		return result;
	}
}
