import java.awt.Graphics;

public class ObjectManager {
	private Rocketship rocketship;

	public ObjectManager(Rocketship rocketship) {
		this.rocketship = rocketship;
	}

	void update() {
		rocketship.update();
	}
	void draw(Graphics g) {
		rocketship.draw(g);
	}
}
