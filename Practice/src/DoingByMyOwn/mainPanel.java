package DoingByMyOwn;

 import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class mainPanel extends JPanel implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	
	private final int PANEL_WIDTH = 1280;
	private final int PANEL_HEIGHT = 720;
	
	Font font = new Font("Arial", Font.PLAIN, 55);
	
	Image background;
	Image ship;
	Timer timer;
	char key;
	int xVelocity = 5;
	int yVelocity = 5;
	int x = 0;
	int y = 0;
	
	mainPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		
		ship = new ImageIcon("spaceship.png").getImage();
		background = new ImageIcon("SpaceBgRaw.jpg").getImage();
		timer = new Timer(10, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D gPaint = (Graphics2D) g;
		
		gPaint.drawImage(background, 0, 0, null);
		gPaint.drawImage(ship, x, y, null);
		
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(x>=1000 || x<0) {
//			xVelocity *= -1;
//		}
//		if(y<0 || y>582) {
//			yVelocity *= -1;
//		}
//		
//		x += xVelocity;
//		y += yVelocity;
		
		if(key == 'a') {
			x += xVelocity;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		key = e.getKeyChar();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
