package com.sist.client;
// 네이버영화
import javax.swing.*; // 윈도우관련
import java.awt.*; // color, layout
import java.awt.event.*; // interface

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener{ 
	// panel=>mouselistener
	// 윈도우 크기 결정 ==> 생성자에서 (291page)
	JLabel title=new JLabel("영화 예매 & 추천 프로그램",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp;
	int curpage=1;
	int totalpage=16;
	
	public ClientMainFrame()
	{
		cp=new ControlPanel(this);
		// 새로운창이 아닌 현재 실행중인 윈도우창을 전송
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
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this); //◀
		cp.ff.b2.addActionListener(this); //▶
		
		cp.df.b2.addActionListener(this); //상세화면-목록버튼
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		
		/*
		 * for(int i=0;i<10;i++) { cp.ff.mc[i].addMouseListener(this); }
		 */
		
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
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5)
		{
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2)
		{
			cp.card.show(cp, "FF");
		}
		
		else if(e.getSource()==cp.ff.b1) //이전버튼
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll(); // JPanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); // JPanel의 원래 기능을 재배치
			}
		}
		else if(e.getSource()==cp.ff.b2) //다음버튼
		{
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); 
			}
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf) //검색창에서 검색버튼(b6) or 엔터쳤을때(tf)
		{
			// 1 입력된 값 읽기
			String ss=cp.lf.tf.getText();
			if(ss.length()<1) //입력된 검색어가 없을경우
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus();
				return; //메소드종료
			}
			cp.lf.movieFindData(ss);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2) // 포스터 더블클릭->상세정보
				{
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");
					break;
				}
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
/*
 *  clientmainframe : mf, cf, cp 외의 다른 클래스에 접근할 수 없기 때문에 
 *  				movieform, detailform 은 한단계 거쳐야 접근가능 
 *  모든 액션은 clientmainframe에서 해야 함
 */
}
