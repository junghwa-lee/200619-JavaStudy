package com.sist.client;
// 윈도우 전체 => JFrame
// 윈도우와 관련된 클래스를 읽어온다

import javax.swing.*; // 윈도우관련
import java.awt.*; // color, layout
import java.awt.event.*; // interface
/*
 *   재사용
 *    - 상속 (is-a) : 기존의 클래스를 변경해서 사용
 *    - 포함 (has-a) : 기존의 클래스를 변경없이 사용
 *     
 *   
 */
public class ClientMainFrame extends JFrame implements ActionListener{
	// 윈도우 크기 결정 ==> 생성자에서 (291page)
	JLabel title=new JLabel("레시피 & 맛집 추천사이트",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	
	public ClientMainFrame()
	{
		/*
		 *  클래스에서 생성자 사용 => 선언이 아니라 구현할 때
		 *  예)
		 *   데이터베이스 : 오라클 연결
		 *   네트워크 : 셋팅 => IP,PORT => 핸드폰(개통)
		 *   웹 : 쿠키에서 값읽기 => 자동 로그인
		 */
		// 타이틀 배치
		title.setFont(new Font("굴림체",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.GREEN);
		setLayout(null); //JFrame (BorderLayout) 사용자 정의로 배치 => (null)
		title.setBounds(10, 15, 1570, 100);
		add(title); // 윈도우에 추가
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		// 채팅폼
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// X버튼 클릭 => 종료
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 생성자는 호출시에 반드시 ==> new 생성자()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); // +build path
		new ClientMainFrame();
	}
	
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    } // 지정한크기에 맞춘다

	@Override
	public void actionPerformed(ActionEvent e) {    // 메뉴바 버튼처리
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}
