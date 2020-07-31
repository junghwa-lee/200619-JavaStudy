package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *    서버가동
 *      ServerSocket(Socket=전화기)
 *    접속시에 처리
 *      accept()
 *    통신
 *      write()
 *      read()
 *      
 */
public class Server implements Runnable{
	//접속 받는 Socket => 교환 소켓
	ServerSocket ss=null;
	//서버 가동
	//한개의 컴퓨터에서는 여러 개 동시 수행이 불가능
	//접속자 정보 저장
	Vector<Client> waitVc=new Vector<Client>();
	public Server()
	{
		try
		{
			ss=new ServerSocket(5353); //bind(ip,port) -> listen()
			//서버가동
			System.out.println("Server Start!!");
		}catch(Exception ex) {}
	}
	// 접속시에 처리
	public void run()
	{
		try {
			while(true)
			{
				Socket s=ss.accept(); //접속을 했을 경우 => 접속자의 IP, PORT 확인
				// IP, PORT => Socket(발신자정보)
//				System.out.println("접속자 IP:"+s.getInetAddress().getHostAddress());
//				System.out.println("접속자의 PORT(연결선):"+s.getPort());
				Client c=new Client(s); // 접속자와 쓰레드 연결
				waitVc.add(c); //클라이언트 저장
				c.start();// 접속자와 통신 시작
			}
		} catch (Exception e) {}
		
	}
	//접속자마다 따로 통신 가능
	class Client extends Thread
	{
		Socket s; // 접속한 클라이언트와 연결
		OutputStream out; // 클라이언트에 결과값 전송
		BufferedReader in; // 클라이언트 요청시에 값을 받는 클래스
		
		public Client(Socket s) //내부클래스
		{
			try {
				this.s=s; // s=> 클라이언트  //변수명이 클래스와 겹친다-> this				
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
		}
		//통신시작
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine(); //채팅문자열 받기
					for(Client user:waitVc)
					{
						user.out.write((msg+"\n").getBytes()); // getbytes : 인코딩
						//네트워크 :1byte => 받을 때(한글포함) => 2byte로 변환해야함
						//Stream(1byte) => Reader(2byte)
					}
					
				}
			}catch(Exception ex) {}
		}
	}
	public static void main(String[] args) {
		Server server=new Server(); // 서버가동
		new Thread(server).start(); // 접속처리 => 접속을 기다린다
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
