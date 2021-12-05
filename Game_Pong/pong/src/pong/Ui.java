package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Ui {
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD,20));
		g.drawString(Game.pontosPlayer + " / " + Game.pontosEnemy, 10, 20);
	}
}
