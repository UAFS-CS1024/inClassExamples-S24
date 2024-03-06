package gameS24;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	private static double oneSecond = 1000000000;
	private Dimension dim;
	private Thread gameThread;
	private int framesPerSecond;
	GameObject gameObject;
	
	
	public GamePanel() {
		this.dim = new Dimension(800,600);
		this.setPreferredSize(dim);
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.framesPerSecond=60;
		this.gameObject = new GameObject(Color.BLUE,100,100,50,50);
		
	
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.run();
	}

	@Override
	public void run() {
		double drawInterval = oneSecond/this.framesPerSecond;
		double delta=0;
		long lastTime = System.nanoTime();
		long currentTime;
		
		
		// Main Game Loop
		while(gameThread!=null) {
			currentTime = System.nanoTime();
			delta = delta + (currentTime - lastTime)/drawInterval;
			lastTime = currentTime;
			
			if(delta>=1) {
				update();
				repaint();
				delta--;
			}
		}
		
	}
	
	public void update() {
		gameObject.update();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		gameObject.draw(g);
		
		Toolkit.getDefaultToolkit().sync();
	}
}
