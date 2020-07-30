package com.sist.client;

import java.awt.*;

import java.net.*;

import javax.swing.JPanel;

public class MovieCard extends JPanel{
	String title,poster;
	Image img;
	public MovieCard(String title,String poster)
	{
		this.title=title;
		this.poster=poster;
		try
		{
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception ex) {}
		setToolTipText(title); // 커서를 대면 설명박스 띄우는 창
	}
	
	public void paint(Graphics g) //사진 위에 글자
	{
		g.drawImage(img,0,0,getWidth(),getHeight(),this);

	}
}