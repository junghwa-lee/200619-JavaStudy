package com.sist.inter;
/*
 *    자바에서 지원한 인터페이스
 *    1. Window(javax.swing)
 *       ActionListener : 버튼, 메뉴, text에서 엔터  ==> 채팅,검색..
 *         = actionPerformed()
 *       MouseListener : 마우스 관련 , JTable, JTree, JLabel
 *         = mouseClicked()
 *         = mouseReleased()
 *         = mousePressed()
 *         = mouseEntered()
 *         = mouseExited()
 *       MouseMotionListener 
 *         = mouseMoved()
 *         = mouseDragged()
 *       KeyListener :키보드
 *         = keyPressed()
 *         = keyReleased()
 *         = keyTyped()
 *       FocusListener
 *         = foucusLost()
 *         = focusGained()
 *       ItemListener : ComboBox, JList
 *         = itemStateChanged()
 *              
 *    2. 데이터베이스연결
 *       Connection
 *       Statement
 *       ResultSet
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{ //다중상속
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	// 초기화 ==> 메모리에저장 (생성자)
	public MainClass2()
	{
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\air.png"));
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("박문수");
		box.addItem("이순신");
		// JFrame => BorderLayout ==> 5군데 배치가능 (E,W,S,N,C)
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		
		//화면크기
		setSize(450, 500);
		setVisible(true);
		
		// 이벤트 등록
		// ==> b1 버튼 클릭하면 => actionPerformed() 호출
		b1.addActionListener(this); // ()안에 처리하는 함수의 위치를 넣어준다
									//this => 현재 클래스 안에 있음 (MainClass2)
		tf.addActionListener(this);
		la.addMouseListener(this);
		box.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			if(e.getClickCount()==2)
			{
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "버튼클릭!!"); //어느 윈도우위에 창을 띄울것인가?
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this,msg);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=(String)box.getSelectedItem();
			JOptionPane.showMessageDialog(this, name);
			
		}
	}

}
