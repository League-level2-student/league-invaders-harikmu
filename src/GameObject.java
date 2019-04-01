import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;
public GameObject(int x, int y, int width, int height) {
	x=444;
	y=444;
	width=100;
	height=100;
}
void update() {
	
}
void draw(Graphics g) {
	g.fillRect(x,y,100,100);
}
}
