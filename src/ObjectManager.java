import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	private Rocketship rocketship;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	public ObjectManager(Rocketship rocketship) {
		this.rocketship = rocketship;
	}

	void update() {
		rocketship.update();
	}

	void draw(Graphics g) {
		rocketship.draw(g);
	}
	void addProjectile(Projectile p) {
		projectiles.add(p);
	}
}
