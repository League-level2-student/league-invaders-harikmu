import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener {
private Timer timer;
private GameObject object;
public GamePanel() {
	timer = new Timer(1000/60,this);
	object = new GameObject(0, 0, 0, 0);
}
@Override
public void actionPerformed(ActionEvent e) {
	object.update();
	repaint();
}
void startGame() {
	timer.start();
}
@Override
public void paintComponent(Graphics g){
	object.draw(g);
}
@Override
public void keyTyped(KeyEvent e) {
	System.out.println("o");
}
@Override
public void keyPressed(KeyEvent e) {
	System.out.println("i");
}
@Override
public void keyReleased(KeyEvent e) {
	System.out.println("h");
}
}

