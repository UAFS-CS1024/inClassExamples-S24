import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingApp implements ActionListener{
	public JFrame window;
	public JPanel panel;
	public JLabel label1;
	public JTextField field1;
	public JButton button1;
	public JButton button2;
	
	public SwingApp() {
		window = new JFrame("Swing App");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setMinimumSize(new Dimension(400,300));
		
		panel = new JPanel();
		
		label1 = new JLabel("Name:");
		field1 = new JTextField(30);
		button1 = new JButton("Submit");
		button1.addActionListener(this);
		
		button2 = new JButton("Button2");
		button2.addActionListener(this);
		panel.add(label1);
		panel.add(field1);
		panel.add(button1);
		panel.add(button2);
		
		window.add(panel);
		window.pack();
		window.setVisible(true);
	}

	public static void main(String[] args) {
		SwingApp app = new SwingApp();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource().equals(button1)) {
			System.out.println(this.field1.getText());
		}
		if(event.getSource().equals(button2)) {
			System.out.println("Clicked Button 2");
		}
		System.out.println(this.field1.getText());
		
	}

}
