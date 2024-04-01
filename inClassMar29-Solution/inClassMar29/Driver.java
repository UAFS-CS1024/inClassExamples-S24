package inClassMar29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Operation> operations = new ArrayList<Operation>();
		int index;
		Operation op;
		
		loadArray("operations.txt",operations);
		for(index=0;index<operations.size();index++) {
			op = operations.get(index);
			System.out.printf("Op: %3s - %3d,%3d = %3d\n", op.getOp(), op.getNum1(),op.getNum2(),op.performOp());
		}

	}

	public static void loadArray(String filename, ArrayList<Operation> operations) {
		File file;
		Scanner in;
		String record;
		String[] fields;
		
		file = new File(filename);
		try {
			in = new Scanner(file);
			while(in.hasNextLine()==true) {
				record = in.nextLine();
				fields = record.split(",");
				if(fields[0].equals("add")) {
					operations.add(new Add(fields[0],Integer.parseInt(fields[1]),Integer.parseInt(fields[2])));
				}
				if(fields[0].equals("sub")) {
					operations.add(new Subtract(fields[0],Integer.parseInt(fields[1]),Integer.parseInt(fields[2])));
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
