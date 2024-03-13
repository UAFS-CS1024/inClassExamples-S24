

import javax.swing.JFrame;

public class GameWindow {

	public static void main(String[] args) {
		JFrame gameWin = new JFrame();
		gameWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWin.setLocationRelativeTo(null);
		gameWin.setTitle("OOP Game");
		gameWin.setResizable(false);
		
		GamePanel gamePanel = new GamePanel();
		gameWin.add(gamePanel);
		
		gameWin.pack();
		gameWin.setVisible(true);
		
		gamePanel.startGameThread();

	}

}
