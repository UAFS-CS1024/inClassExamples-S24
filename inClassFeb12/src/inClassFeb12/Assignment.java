package inClassFeb12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {

	public static void main(String[] args) throws IOException {
		double test[][];
		
		test=loadArray2D("array3.txt");
		showArray2D(test);
	}
	
	public static void writeArray2D(double[][] theArray, String fileName) {
		
	}
	
	public static double[][] loadArray2D(String fileName) throws IOException {
		FileReader file = new FileReader(fileName);
		BufferedReader in = new BufferedReader(file);
		String buffer;
		String[] fields;
		int rows,cols,row,col;
		double[][] theArray;
		
		buffer = in.readLine(); //*** Header ***
		fields = buffer.split(" ");
		rows = Integer.parseInt(fields[1]);
		cols = Integer.parseInt(fields[2]);
		theArray = new double[rows][cols];
		
		for(row=0;row<rows;row++) {
			buffer=in.readLine();
			fields=buffer.split(" ");
			for(col=0;col<cols;col++) {
				theArray[row][col] = Double.parseDouble(fields[col]);
			}
		}
		
		in.close();
		file.close();
		return theArray;
	}
	
	public static void showArray2D(double[][] array) {
		int row, col;
		
		for(row=0;row<array[0].length;row++) {
			System.out.printf("-----");
		}
		System.out.printf("--\n");
		for(row=0;row<array.length;row++) {
			System.out.printf("|");
			for(col=0;col<array[row].length;col++) {
				System.out.printf(" %3.1f ",array[row][col]);
			}
			System.out.printf("| \n");
		}
		for(row=0;row<array[0].length;row++) {
			System.out.printf("-----");
		}
		System.out.printf("--\n");
	}

}
