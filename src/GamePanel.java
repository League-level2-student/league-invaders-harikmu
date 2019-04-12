import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	private Timer timer;
	private Font titleFont;
	private Font font2;
	private Font font3;
	public GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 60);
		font2 = new Font("Arial", Font.PLAIN, 32);
		font3 = new Font("Arial", Font.PLAIN, 32);
	}

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (currentState == MENU_STATE) {
			updateMenuState(null);
		} else if (currentState == GAME_STATE) {
			updateGameState(null);
		} else if (currentState == END_STATE) {
			updateEndState(null);
		}
		repaint();
	}

	void startGame() {
		timer.start();
	}

	void updateMenuState(Graphics g) {

	}

	void updateGameState(Graphics g) {

	}

	void updateEndState(Graphics g) {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString("league invaders",40,100);
		g.setFont(font2);
		g.setColor(Color.WHITE);
		g.drawString("press *enter* to start",100,300);
		g.setFont(font3);
		g.setColor(Color.WHITE);
		g.drawString("press *space* for instructions",43,500);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("o");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			currentState++;
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
		if (currentState == MENU_STATE && e.getKeyCode() == 32) {
			JOptionPane.showMessageDialog(null, "use arrow keys to move and space to fire");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("h");
	}
}
