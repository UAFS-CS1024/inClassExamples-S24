

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	private static final long serialVersionUID = -3972033359713752978L;
	private Dimension dim;
	private Thread gameThread;
	private int framesPerSecond;
	ArrayList<GameObject> gameObjects;
	Player player;
	Missle missle;
	
	
	public GamePanel() {
		this.dim = new Dimension(800,600);
		this.setPreferredSize(dim);
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
		this.framesPerSecond=60;
		player = new Player(this);
		missle = new Missle();
		this.addKeyListener(player);
		
		gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new Block(Color.BLUE,100,100,20,20,20));
		gameObjects.add(new Ball(Color.GREEN,200,200,40,40,2));
		gameObjects.add(new Block(Color.YELLOW,300,300,50,50,5));
		gameObjects.add(new Ball(Color.RED,400,400,25,25,10));
		gameObjects.add(new Block(Color.CYAN,500,500,30,30,8));
		gameObjects.add(new Ball(Color.ORANGE,150,1500,10,10,7));
	}

	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.run();
	}

	@Override
	public void run() {
		DeltaTime deltaTime = new DeltaTime();
		deltaTime.start(this.framesPerSecond);
		
		
		// Main Game Loop
		while(gameThread!=null) {	
			deltaTime.update();
			
			if((deltaTime.getDelta())>=1) {
			
				update(deltaTime.getDelta());
				repaint();
				
				deltaTime.resetDelta();
			}
			
		}
		
	}
	
	public void update(double delta) {
		int index;
		GameObject g;
		
		this.player.update();
		this.missle.update();
		for(index=0;index<gameObjects.size();index++) {
			g = gameObjects.get(index);
			g.update();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int index;
		GameObject gm;
		
		this.player.draw(g);
		this.missle.draw(g);
		for(index=0;index<gameObjects.size();index++) {
			gm = gameObjects.get(index);
			gm.draw(g);
		}
		
		Toolkit.getDefaultToolkit().sync();
	}
}
