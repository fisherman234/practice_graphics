package DoingByMyOwn;

import javax.swing.JFrame;

public class mainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	
	mainPanel panel;
	
	mainWindow() {
		panel = new mainPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new mainWindow();
	}
}
