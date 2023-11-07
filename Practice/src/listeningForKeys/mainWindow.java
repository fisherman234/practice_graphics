package listeningForKeys;

import javax.swing.JFrame;

public class mainWindow extends JFrame{

	private static final long serialVersionUID = 1L;

	mainWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new mainPanel());
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new mainWindow();
	}
}
