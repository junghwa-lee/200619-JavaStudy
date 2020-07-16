package com.sist.client;
import java.awt.*;
import java.awt.event.*; //��ưŬ���Ҷ�

import javax.swing.*;
/*
 *  �ڹ� ��Ű�� ==> java(JDK1.0~)=>Java, javax(JDK1.2~)=>java2(SUN), JDK1.8(Oracle)
 *  JDK1.8 => JavaScript ��ü����, ���ٽ�(�Լ�������) 
 *  
 *   ������ Ŭ���� ����ϴ¹��
 *    ���� -> �ִ±״�� (����x)
 *    ���  -> �ʿ��� �κ��� �����ؼ� ��� ����(�������̵�)
 *  
 *  
 */
import com.sist.common.*;
public class RecipeMainFrame extends JFrame implements ActionListener{
	//JFrame f=new JFrame(); ����Ŭ���� 
	//��ġ
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		
		//GUI�� ȭ�� ������, ������ �ʱ�ȭ, �����ͺ��̽� ����, ���� ����, ������ ����
		//Layout => ȭ���ġ
		setLayout(card);
		//ȭ�� �߰�
		
		add("JOIN",join);
		add("LOGIN",login);
	add("RM",rm);
		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�ݱ��ư ������ �޸� ���� 
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(), "LOGIN");
		}
	}

}
