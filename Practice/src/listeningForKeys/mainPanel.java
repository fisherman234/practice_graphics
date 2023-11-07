package listeningForKeys;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class mainPanel extends JPanel implements KeyListener{

	private static final long serialVersionUID = 1L;

	Image cube;
	int x;
	int y;
	
	mainPanel() {
		this.setPreferredSize(new Dimension(500,500));
		this.addKeyListener(this);
		
		cube = new ImageIcon("sprite.png").getImage();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("key:"+e.getKeyCode());
	}
}
