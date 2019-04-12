import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	public static void main(String[] args) throws Exception {
		LeagueInvaders leagueinvaders = new LeagueInvaders();
		leagueinvaders.setup();
	}

	private JFrame f = new JFrame();
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	private GamePanel panel;

	public LeagueInvaders() {
		panel = new GamePanel();
	}

	private void setup() {
		f.add(panel);
		f.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		f.pack();
		panel.startGame();
		f.addKeyListener(panel);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(WIDTH, HEIGHT);
	}
}
