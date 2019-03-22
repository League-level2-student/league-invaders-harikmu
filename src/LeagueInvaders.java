import javax.swing.JFrame;

public class LeagueInvaders {
	public static void main(String[] args) throws Exception {
		LeagueInvaders leagueinvaders = new LeagueInvaders();
		leagueinvaders.setup();
	}
	JFrame f = new JFrame();
	final int width = 500;
	final int height = 800;
	private void setup() {
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(width,height);
	}
}
