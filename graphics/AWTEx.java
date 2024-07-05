package com.kiet.graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEx implements ActionListener{

	Frame f;
	Label l;
	TextField t1;
	TextArea ta;
	Button b;
	Checkbox c1,c2;
	CheckboxGroup g1;
	Choice c;
	List l1;
	Scrollbar s;
	Menu m;
	MenuItem m1,m2,m3;
	MenuBar mb;
	public AWTEx() {
		f=new Frame();
		
		f.setSize(500,500);
		f.setTitle("AWT Components");
		f.setLayout(new FlowLayout());
		f.setLocation(200,300);
		f.setVisible(true);
		l=new Label("working with AWT Components");
		f.add(l);
		t1=new TextField(20);
		f.add(t1);
		ta=new TextArea("TextArea",5,20);
		f.add(ta);
		b=new Button("Click here");
		f.add(b);
		c=new Choice();
		c.add("apple");
		c.add("Mango");
		c.add("banana");
		f.add(c);
		g1=new CheckboxGroup();
		c1=new Checkbox("male",true,g1);
		f.add(c1);
		c2=new Checkbox("Female",false,g1);
		f.add(c2);
		l1=new List(3,true);
		l1.add("abc");
		l1.add("xusnd");
		l1.add("jfbng");
		l1.add("fnbjg");
		f.add(l1);
		s=new Scrollbar(Scrollbar.HORIZONTAL);
		f.add(s);
		mb=new MenuBar();
		m=new Menu("Menu");
		m1=new MenuItem("fbvfnv");
		m2=new MenuItem("fbvfnv");
		m3=new MenuItem("fbvfnv");
		m.add(m1);
		m.add(m2);
		m.add(m3);
		mb.add(m);
		f.setMenuBar(mb);
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWTEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f.setBackground(Color.cyan);
	}

}
