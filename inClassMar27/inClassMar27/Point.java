package inClassMar27;

import java.io.Serializable;

public class Point implements Serializable{
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		String str;
		
		str = "Point: " + this.getX() + "," + this.getY();
		return str;
	}
}
