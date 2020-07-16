package com.sist.client;
import java.awt.*;
import java.awt.event.*; //버튼클릭할때

import javax.swing.*;
/*
 *  자바 패키지 ==> java(JDK1.0~)=>Java, javax(JDK1.2~)=>java2(SUN), JDK1.8(Oracle)
 *  JDK1.8 => JavaScript 자체제어, 람다식(함수포인터) 
 *  
 *   기존의 클래스 사용하는방법
 *    포함 -> 있는그대로 (변경x)
 *    상속  -> 필요한 부분을 변경해서 사용 가능(오버라이딩)
 *  
 *  
 */
import com.sist.common.*;
public class RecipeMainFrame extends JFrame implements ActionListener{
	//JFrame f=new JFrame(); 포함클래스 
	//배치
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		
		//GUI의 화면 디자인, 변수의 초기화, 데이터베이스 연결, 서버 연결, 쓰레드 동작
		//Layout => 화면배치
		setLayout(card);
		//화면 추가
		
		add("JOIN",join);
		add("LOGIN",login);
	add("RM",rm);
		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //닫기버튼 누르면 메모리 삭제 
		
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
