package inClassMar27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		Point point = new Point(10,20);
		Point point1;
		
		System.out.println(point.toString());
		savePoint(point);
		
		point1=loadPoint();
		System.out.println(point1.toString());

	}
	
	public static void savePoint(Point point) {
		FileOutputStream oStream;
		ObjectOutputStream out;
		
		try {
			oStream = new FileOutputStream("point.dat");
			out = new ObjectOutputStream(oStream);
			out.writeObject(point);
			out.close();
			oStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Point loadPoint() {
		FileInputStream iStream;
		ObjectInputStream in;
		Point point=null;
		
		try {
			iStream = new FileInputStream("point.dat");
			in = new ObjectInputStream(iStream);
			point = (Point) in.readObject();
			in.close();
			iStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return point;
	}

}
