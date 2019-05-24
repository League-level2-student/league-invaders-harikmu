import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ObjectManager {
	private Rocketship rocketship;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Aliens> aliens = new ArrayList<Aliens>();
	long enemyTimer;
	int enemySpawnTime;
	Random random;

	public ObjectManager(Rocketship rocketship) {
		this.rocketship = rocketship;
		enemyTimer = 0;
		random = new Random();

	}

	void update() {
		rocketship.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
		}
	}

	void draw(Graphics g) {
		rocketship.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
		}
	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	void addAliens(Aliens a) {
		aliens.add(new Aliens(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAliens(new Aliens(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	public void purgeObjects() {
		for (int i = 0; i < projectiles.size(); i++) {

		}
	}
}
