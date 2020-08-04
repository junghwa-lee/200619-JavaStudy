package com.sist.client;
// 네이버영화
import javax.swing.*; // 윈도우관련

import com.sist.common.Function;

import java.awt.*; // color, layout
import java.awt.event.*; // interface
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *   1. 사용자가 서버에 요청
 *   2. 서버에서 들어오는 응답을 받아서 출력(쓰레드) => 자동화
 */
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{ 
	// panel=>mouselistener
	// 윈도우 크기 결정 ==> 생성자에서 (291page)
	JLabel title=new JLabel("영화 예매 & 추천 프로그램",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	Login login=new Login();
	ControlPanel cp;
	int curpage=1;
	int totalpage=16;
	//네트워크 관련 프로그램
	Socket s; //연결기계
	OutputStream out; // 서버로 요청값 전송 ==> 로그인, 채팅 문자열, 종료...
	BufferedReader in; // 서버로부터 값을 받아오는 클래스  ==> 쓰레드
	
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
		//setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);// X버튼 클릭 => 종료
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //종료불가
		
		
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
		
		// 로그인 처리
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//종료
		mf.b7.addActionListener(this);
		
		//채팅
		cf.tf.addActionListener(this);
		
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
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1) // id입력하지 않은 경우
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1) // id입력하지 않은 경우
			{
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			
			// 서버로 입력받은 데이터 전송
			try {
				//연결
				s=new Socket("localhost",5656);
				//송수신 위치 확인
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
			
				//로그인 요청(서버로 전송)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			} catch (Exception ex) {}
				
			//서버에서 전송하는 데이터를 읽어서 출력
			new Thread(this).start();
			//run의 위치 확인 ==> 자신의 클래스 안에 존재 => (this)
		}
		
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		
		else if(e.getSource()==cf.tf) //채팅
		{
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			//데이터를 서버로 전송
			try {
				 out.write((msg+"\n").getBytes());
			} catch (Exception ex) {}
			
			cf.tf.setText("");
		}
		
		else if(e.getSource()==mf.b7)
		{
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			} catch (Exception ex) {}
			
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
					//cp.df.detailPrint(a);
					df.detailPrint(a);
					//cp.card.show(cp, "DF");
					df.setVisible(true);
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

	@Override
	public void run() {
		// 서버에서 들어오는 데이터를 받아서 처리
		try {
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=new StringTokenizer(msg, "|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						login.setVisible(false); // 로그인창 
						setVisible(true); // 영화창(Main)
					}
					break;
					case Function.LOGIN:
					{
						//  테이블에 출력
						String[] data= {
								st.nextToken(), //id
								st.nextToken(), //name
								st.nextToken()  //sex
						};
						cf.model.addRow(data); 
					}
					break;
					case Function.CHAT:
					{
						cf.ta.append(st.nextToken()+"\n");
					}
					break;
					case Function.EXIT:
					{
						String id=st.nextToken();
						for(int i=0;i<cf.model.getRowCount();i++)
						{
							String mid=cf.model.getValueAt(i, 0).toString();
							if(id.equals(mid))
							{
								cf.model.removeRow(i);
								break;
							}
						}
					}
					break;
					case Function.MYEXIT:
					{
						dispose(); //윈도우 메모리 해제
						System.exit(0); //프로그램 종료
				
					}
					break;
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
		}
		
	}
}
