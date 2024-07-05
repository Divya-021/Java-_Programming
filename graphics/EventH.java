package com.kiet.graphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;

public class EventH implements ActionListener, ComponentListener {

	JFrame f;
	JLabel l;
	JTextField t;
	JButton b1,b2;
	
	public EventH() {
		f=new JFrame("Event Handling Program");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.yellow);
		l=new JLabel("Display text here");
		t=new JTextField(20);
		b1=new JButton("ok");
		b2=new JButton("Cancel");
		f.add(l);
		f.add(t);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(this);
		f.addComponentListener(this);
		//b2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventH();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*if(e.getSource()==b1)
			f.getContentPane().setBackground(Color.red);
		else
			f.getContentPane().setBackground(Color.cyan);*/
		String s=t.getText();
		l.setText(s);
	}
	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		l.setText("Resized");
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		l.setText("Moved");
	}
	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		l.setText("Shown");
	}
	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		l.setText("Hidden");
	}

}
