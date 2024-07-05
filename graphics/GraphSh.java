package com.kiet.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class GraphSh extends Frame {

	public GraphSh() {
		setSize(500,500);
		setTitle("MyFRame");
		setBackground(Color.cyan);
		setVisible(true);
	}

	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		g.drawString("Hello GUI", 50, 50);
		g.setColor(Color.white);
		g.fillRect(70, 50, 50, 50);
		g.fillOval(70,100,100,100);
		g.drawLine(70, 100, 200, 200);
		g.setColor(Color.black);
		g.drawArc(170,200, 100, 100, 0, 90);
		String url="C:\\Users\\Administrator\\Downloads\\download.jpg";
		Image img=new ImageIcon(url).getImage();
		g.drawImage(img, 170, 250, 200, 200, null);
		int x[]= {100,200,300};
		int y[]= {200,300,200};
		int n=3;
		g.drawPolygon(x, y, n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphSh sh=new GraphSh();
	}

}
