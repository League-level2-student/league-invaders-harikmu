import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;
	boolean up;
	boolean down;
	boolean left;
	boolean right;

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		up = false;
		down = false;
		left = false;
		right = false;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

	void update() {
		super.update();
		if (up == true) {
			if (!(y < 0)) {
				y -= speed;
			}
		}
		if (down == true) {
			if (!(y >= 750)) {
				y += speed;
			}
		}
		if (left == true) {
			if (x > 0) {
				x -= speed;
			}
		}
		if (right == true) {
			if (!(x >= 450)) {
				x += speed;
			}
		}
	}

	public void up() {
		if (!(y < 0)) {
			y -= speed;
		}
	}

	public void down() {
		if (!(y >= 750)) {
			y += speed;
		}
	}

	public void left() {
		if (x > 0) {
			x -= speed;
		}
	}

	public void right() {
		if (!(x >= 450)) {
			x += speed;
		}
	}
	public Projectile getProjectile() {
        return new Projectile(x+width/2, y, 10, 10);
} 
}
