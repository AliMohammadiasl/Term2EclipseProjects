import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener {

	/* Attributes a.k.a. Instance Variables */
	int w = 800, h = 800;

	public void paint(Graphics g) {
		super.paintComponent(g);
		rings(g, 200, 0, 0);
		//clover(g, 200,0,0);
		//squares(g, 250,0,0);
		//lines(g, 300, w/2,h/2);
		//tree(g, 300, w/2,800);
	}// end of paint method - put code above for anything dealing with drawing -

	public void squares(Graphics g, int len, int x, int y) {
	
		//each method draws one square using fillRect
		int R = (int)(Math.random()*255);
		int G = (int)(Math.random()*255);
		int B = (int)(Math.random()*255);
		 Color c = new Color(R,G,B);
		g.setColor(c);
		g.fillRect(x+((w/2))-(len/2), y+(h/2)-(len/2), len, len);
		
		
		
		 g.setColor(c);
		if(len>10){
			//clover (g,,,,);
			int z = 3;
			g.setColor(c);
			squares(g, (len/z),x-len,y-len);
			squares(g, (len/z),x+len,y-len);
			squares(g, (len/z),x,y-len);
			squares(g, (len/z),x-len,y);
			squares(g, (len/z),x+len,y);
			squares(g, (len/z),x-len,y+len);
			squares(g, (len/z),x+len,y+len);
			squares(g, (len/z),x,y+len);
			
			
		}
		
		
		
		//only draw if len is big enough
		//each method then Eight copies of itself
		//to draw the smaller squares surrounding itself
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void lines(Graphics g, int len, int x, int y) {
		
		g.drawLine(x, y, x+len/2, y+len/2);
		g.drawLine(x, y, x-len/2, y+len/2);
		g.drawLine(x, y, x-len/2, y-len/2);
		g.drawLine(x, y, x+len/2, y-len/2);
		g.drawLine(x, y, x+len, y);
		g.drawLine(x, y, x-len, y);
		
		if(len>10){
			int z = 3;
			lines(g, len/z, x+len/2, y+len/2);
			lines(g, len/z, x-len/2, y+len/2);
			lines(g, len/z, x-len/2, y-len/2);
			lines(g, len/z, x+len/2, y-len/2);
			lines(g, len/z, x+len, y);
			lines(g, len/z, x-len, y);
		}
			
			
			
		
		
		
	}
	
	
	public void tree(Graphics g, int len, int x, int y) {
		
		
		g.drawLine(x, y, x, y-len/2);
		//g.drawLine(x, y-len/2, x+len/2, y-len);
		//g.drawLine(x, y-len/2, x-len/2, y-len);
		
		
		if(len>10){
			int z = 3;
			tree(g, len/z, x-len/2, y-len);
			tree(g, len/z, x+len/2, y-len);
		}
		
		
		
		
		
		
	}
	
	
	public void clover(Graphics g, int radius, int x, int y) {

		//each method is in charge of drawing 4 circles!
		g.drawOval(x, y, radius, radius);
		
		//draw the oval to the right of the first
		g.drawOval(x+radius, y, radius, radius);
		
		//draw the oval to the right of the first
		g.drawOval(x, y+radius, radius, radius);
		
		//draw the oval to the right of the first
		g.drawOval(x+radius, y+radius, radius, radius);
		
		//it will then invoke a new method keep drawing
		if(radius>1){
			//clover (g,,,,);
			clover(g,radius-10,x+10,y+10);
		}

	}

	
	
	
	
	
	
	public void rings(Graphics g, int radius, int x, int y) {
		// each method call draws one part of the fractal
		g.drawOval(x, y, radius, radius);
		
		if(radius > 2){
			rings(g, radius-10, x+5, y+5);
		}

	}

	/**
	 * Update the positions of the ball and paddle. Update the scores, counter
	 * and time
	 */
	public void update() {

	}// end of update method - put code above for any updates on variable

	// ==================code above ===========================

	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}

	public static void main(String[] arg) {
		Driver d = new Driver();
	}

	/* Instantiate any attributes here (instance variables */
	public Driver() {

		JFrame f = new JFrame();
		f.setTitle("Pong");
		f.setSize(w, h);
		f.setBackground(Color.BLACK);
		f.setResizable(false);

		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	Timer t;

}
