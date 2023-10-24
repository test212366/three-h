package yolocha;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Mypanel extends JPanel {

		public void paintComponent(Graphics gr) {
			gr.setColor(Color.green);
			for (int i=0;i<10;i++) {
				gr.fillRect(10*i,10*i,50*i,50*i);
			}
			gr.setColor(Color.YELLOW);
			gr.fillRect(10, 10, 50, 50);
			gr.setColor(Color.RED);
			gr.fillOval(75, 90, 30, 30);
			gr.setColor(Color.white);
			gr.fillOval(85, 95, 13, 7);
			gr.setColor(Color.white);
			gr.fillOval(95, 95, 7, 13);
			gr.setColor(Color.ORANGE);
			gr.fillOval(40, 110, 30, 30);
			gr.setColor(Color.white);
			gr.fillOval(50, 115, 13, 7);
			gr.setColor(Color.RED);
			gr.fillOval(400, 100, 60, 60);
			gr.setColor(Color.ORANGE);
			gr.fillOval(340, 240, 65, 65);
			gr.setColor(Color.RED);
			gr.fillOval(260, 330, 65, 65);
			gr.setColor(Color.white);
			gr.fillOval(280, 340, 20, 10);
			gr.setColor(Color.white);
			gr.fillOval(294, 340, 10, 20);
			gr.setColor(Color.yellow);
			gr.fillOval(140, 390, 60, 60);
			gr.setColor(Color.WHITE);
			gr.fillOval(140, 250, 10, 20);
			gr.setColor(Color.white);
			gr.fillOval(430, 110, 20, 10);
			gr.setColor(Color.white);
			gr.fillOval(440, 110, 10, 20);
			gr.setColor(Color.BLUE);
			gr.fillOval(100, 50, 30, 30);
			gr.setColor(Color.white);
			gr.fillOval(107, 55, 13, 7);
			gr.setColor(Color.white);
			gr.fillOval(115, 55, 7, 13);
			gr.setColor(Color.white);
			gr.fillOval(40, 30, 18, 20);
			gr.setColor(Color.white);
			gr.fillRect(400, 400, 140, 140);
			gr.setColor(Color.white);
			gr.fillRect(460, 300, 80, 100);
			gr.setColor(Color.white);
			gr.fillRect(300, 460, 100, 80);
			gr.setColor(Color.white);
			gr.fillRect(500, 200, 40, 100);
			gr.setColor(Color.white);
			gr.fillRect(200, 500, 100, 40);
			gr.setColor(Color.DARK_GRAY);
			gr.fillRect(400, 400, 80, 80);
			gr.setColor(Color.DARK_GRAY);
			gr.fillRect(440, 440, 80, 80);
			gr.setColor(Color.DARK_GRAY);
			gr.fillRect(420, 420, 80, 80);
			gr.setColor(Color.cyan);
			gr.fillOval(100, 300, 40, 40);
			gr.setColor(Color.RED);
			gr.fillOval(180, 230, 40, 40);
			gr.setColor(Color.ORANGE);
			gr.fillOval(250, 150, 40, 40);
			gr.setColor(Color.RED);
			gr.fillOval(300, 80, 40, 40);
			gr.setColor(Color.CYAN);
			gr.fillOval(200, 50, 30, 30);
			gr.setColor(Color.ORANGE);
			gr.fillOval(120, 140, 30, 30);
			gr.setColor(Color.RED);
			gr.fillOval(170, 90, 30, 30);
			gr.setColor(Color.YELLOW);
			gr.fillOval(70, 180, 30, 30);
			
		}
	}
class Myframe extends JFrame{
	public Myframe() {
		Mypanel nikita = new Mypanel();
		Container cont=getContentPane();
		cont.add(nikita);
		
		setBounds(30,30,800,600);
		setVisible(true);
	}
}

public class pr1 {

	public static void main(String[] args) {
		Myframe okno= new Myframe();

	}

}
