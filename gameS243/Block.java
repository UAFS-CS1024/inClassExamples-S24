import java.awt.Color;
import java.awt.Graphics;

public class Block extends GameObject{

	public Block(Color color, int x, int y, int width, int height, int speed){
		this.setColor(color);
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.setSpeed(speed);
	}
	
	@Override
	public void update() {
		this.setX(getX() + this.getSpeed());
		if(this.getX()>800) {
			this.setX(-50);
		}
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		
	}

}
