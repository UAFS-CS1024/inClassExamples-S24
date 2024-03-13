import java.awt.Color;
import java.awt.Graphics;

public class Missle extends GameObject {
	
	public Missle() {
		this.setColor(Color.RED);
		this.setX((800-this.getWidth())/2);
		this.setY(600-this.getHeight());
		this.setWidth(25);
		this.setHeight(25);
		this.setSpeed(15);
	}

	@Override
	public void update() {
		this.setY(getY() - getSpeed());
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX(), getY(), getWidth(), getHeight());		
	}

}
