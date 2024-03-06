package gameS24;

import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
	private Color color;
	private int x;
	private int y;
	private int height;
	private int width;
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public GameObject() {
		
	}
	
	public GameObject(Color color, int x, int y, int height, int width) {
		this.setColor(color);
		this.setX(x);
		this.setY(y);
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public void update() {
		this.setX(this.getX() + 3);
	}
	
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(this.getY(), this.getX(), this.getWidth(), this.getHeight());
	}
}
