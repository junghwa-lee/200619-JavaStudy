package com.sist.server;
// network => net => 라이브러리
import java.util.*;

import com.sist.common.Function;

import java.io.*; // 입출력(서버와 클라이언트의 데이터 주고받기)
import java.net.*; // 다른 컴퓨터와 연결
/*
 *  일반 서버 (application) => Socket(연결기계) 이용 
 *  웹 서버  => URL 
 *  ===========================================> 연결 지향적 프로그램 TCP
 */
// Server => 접속만담당 => 저장
// Client => 실제 통신 담당 => 클라이언트 마다 따로 통신 => 쓰레드 이용
public class Server implements Runnable{
	private ServerSocket ss; // 접속 받는 클래스 => 정보저장
	private final int PORT=8686;
	
	// 클라이언트 접속시에 저장(IP, PORT) => Vector
	// 쓰레드에서 동기화 프로그램
	private Vector<Client> waitVc=new Vector<Client>();
	
	// 서버가동
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			/*
			 *  bind()  => IP, PORT 묶어주는 역할
			 *    ==> 핸드폰 (개통)
			 *  listen() => 대기상태(클라이언트가 접속하기 전까지 대기)
			 */
			System.out.println("Server Start..");
		}catch(Exception ex) {}
	}
	
	@Override // 클라이언트가 접속했을 때 각자 통신 가능하게 쓰레드와 연결
	
	public void run() {
		try {
			while(true)
			{
				Socket s=ss.accept();
				// accept() : 특수한 메소드 => 클라이언트 접속시에만 호출
				Client client=new Client(s);
				client.start(); // 클라이언트와 통신 승인
			}
		} catch (Exception e) {}
		
	}
	
	
	
	public static void main(String[] args) {
		// 서버가동
		Server server=new Server();
		new Thread(server).start();
		//Server클래스에 있는 run()호출
	}

	// 내부 클래스 => Server가 가지고 있는 데이터를 쉽게 공유 가능
	class Client extends Thread
	{
		//클라이언트와 연결
		Socket s;
		//클라이언트로부터 요청받기
		BufferedReader in;
		//요청 처리 후 결과 응답
		OutputStream out;
		// 변수설정
		String id,name,sex,pos;
		public Client(Socket s)
		{
			try {
				this.s=s;
				// 클라이언트가 요청한 메소드를 읽어오는 메모리 공간
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
			} catch (Exception e) {}
		}
		
		// 통신 => 기능(요청처리)
		public void run()
		{
			try {
				while(true)
				{
					// 클라이언트가 요청한 내용을 받는다
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					// 100|id|대화명|성별
					switch(protocol)
					{
						case Function.LOGIN:
						{
							// 로그인 처리
							// 데이터값 받기
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="대기실"; // 사용자의 기본 정보
							
						// 나(접속한 사람)의 정보를 먼저 보내고, 나는 전체 사람 정보를 모두 읽어온다
							// 접속한 모든 사용자에게 로그인 정보 보내줌
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							// 접속한 사람의 정보 저장
							waitVc.add(this);
							messageTo(Function.MYLOG+"|"+id);
							// 로그인창에서 -> 대기실 창으로 변경
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
							}
							//입장메세지 출력
							messageAll(Function.WAITCHAT+"|[☞"+name+"님이 입장하셨습니다]");
							//개설된 방정보 전송
							
						}
						break;
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						}
						break;
					
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//응답처리
		/*
		   쓰레드는 default : 비동기화
		  synchronized : 동기화
		 */
		// 개인적으로 전송
		public synchronized void messageTo(String msg)
		{
			try {
				out.write((msg+"\n").getBytes()); //인코딩 ==> 디코딩
			} catch (Exception e) {}
		}
		//전체적으로 전송
		public synchronized void messageAll(String msg)
		{
			try {
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
