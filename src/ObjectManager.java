import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ObjectManager implements ActionListener {
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

	void addAliens() {
		aliens.add(new Aliens(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAliens();

			enemyTimer = System.currentTimeMillis();
		}
	}

	public void purgeObjects() {
		for (int i = projectiles.size() - 1; i >= 0; i--) {
			if (projectiles.get(i).isAlive == false) {
				projectiles.remove(i);
			}
		}
		for (int i = aliens.size() - 1; i >= 0; i--) {
			if (aliens.get(i).isAlive == false) {
				aliens.remove(i);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		addAliens();
	}
}
