import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
		public Rocketship(int x, int y, int width, int height) {
			super(x, y, width, height);
			int speed;
		} 
		void draw(Graphics g) {
	        g.setColor(Color.BLUE);
	        g.fillRect(x, y, width, height);
		}
		void update() {
			
		}
    	
    }
