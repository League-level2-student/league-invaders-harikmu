import java.awt.Graphics;

public class ObjectManager {
	private Rocketship rocketship2;

	public ObjectManager(Rocketship rocketship2) {
		rocketship2 = new Rocketship(250, 700, 50, 50);
	}

	void update() {
		rocketship2.update();
	}
	void draw(Graphics g) {
	}
}
