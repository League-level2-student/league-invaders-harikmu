import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject {
	int speed;

	public Aliens(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 1;
	}

	void update() {
		y += speed;
	}

	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
