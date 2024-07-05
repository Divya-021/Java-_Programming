package com.kiet.graphics;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dialog extends JFrame implements ActionListener {
	JLabel l;
	JTextField t;
	JButton b1,b2,b3;
	public Dialog() {
		l=new JLabel("enter value");
		t=new JTextField(20);
		b1=new JButton("Dialog Box");
		b2=new JButton("Input Box");
		b3=new JButton("Confirm Box");
		setSize(500,500);
		setLayout(new FlowLayout());
		setVisible(true);
		add(l);
		add(t);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dialog();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		if(obj==b1) {
			JOptionPane.showMessageDialog(null, "Alert box");
		}
		else if(obj==b2) {
			String s=JOptionPane.showInputDialog(null, "Enter value");
			t.setText(s);
		}
		else {
			JOptionPane.showConfirmDialog(null, "Confirm Box", "ok or cancel", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
