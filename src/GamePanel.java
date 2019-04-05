import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener {
private Timer timer;
public GamePanel() {
	timer = new Timer(1000/60,this);
}
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
@Override
public void actionPerformed(ActionEvent e) {
if(currentState == MENU_STATE){
        updateMenuState(null);
}else if(currentState == GAME_STATE){
        updateGameState(null);
}else if(currentState == END_STATE){
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
public void paintComponent(Graphics g){
if(currentState == MENU_STATE){
        drawMenuState(null);
}else if(currentState == GAME_STATE){
        drawGameState(null);
}else if(currentState == END_STATE){
        drawEndState(null);
}
}
@Override
public void keyTyped(KeyEvent e) {
	System.out.println("o");
}
@Override
public void keyPressed(KeyEvent e) {
	
}
@Override
public void keyReleased(KeyEvent e) {
	System.out.println("h");
}
}

