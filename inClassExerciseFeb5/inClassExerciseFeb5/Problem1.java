package inClassExerciseFeb5;

public class Problem1 {

	public static void main(String[] args) {
		String[] tokens;
		String str=",This,is,a,test,";
		
		tokens=mySplit(str,'s');
		showArray(tokens);
	}
	
	public static void showArray(String[] theArray) {
		int index;
		
		for(index=0;index<theArray.length;index++) {
			System.out.printf("[%d]: %s\n", index,theArray[index]);
		}
	}

	public static String[] mySplit(String str,char delim) {
		String[] tokens;
		int index;
		int indexT=0;    //Token Index
		String temp="";  //Temp String
		int size=0;
		char ch;
		
		for(index=0;index<str.length();index++) {
			ch=str.charAt(index);
			if(ch==delim) {
				size++;
			}
		}
		tokens = new String[size+1];
		
		for(index=0;index<str.length();index++) {
			ch=str.charAt(index);
			if(ch==delim) {
				tokens[indexT]=temp;
				indexT++;
				temp="";
			}else {
				temp = temp + ch;
			}
		}	
		tokens[indexT]=temp;
		return tokens;
	}
}
