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
		setToolTipText(title); // Ŀ���� ��� ����ڽ� ���� â
	}
	
	public void paint(Graphics g) //���� ���� ����
	{
		g.drawImage(img,0,0,getWidth(),getHeight(),this);

	}
}