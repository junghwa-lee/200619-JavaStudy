package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;
public class Server implements Runnable{
	// �������� ����� Socket
	ServerSocket ss;
	final int PORT=5656; 
	// Ŭ���̾�Ʈ ������ ����
	// vector(����ȭ)=> ��Ʈ��ũ, arraylist(��)=>�����ͺ��̽�, linkedlist(��) ����
	Vector<Client> waitVc=new Vector<Client>(); 
	
	// ���� ����
	public Server()
	{
		try {
			ss=new ServerSocket(PORT);
			// bind(): ����  ,  listen(): ���ӽñ��� ���
			System.out.println("Server Start..");
		} catch (Exception e) {}
	}
	
	//Ŭ���̾�Ʈ�� ������ ������ ó�� ���
	public void run()
	{
		try 
		{
			while(true)
			{
				Socket s=ss.accept();
				//Socket => �߽��� ������ ����(IP, PORT)
				//�����ϸ� �����带 �����ؼ� Ŭ���̾�Ʈ���� ����� �ٸ��� �� �� �ְ� �����
				
				//������� ���� -> Socket�� �����ϸ� �� ����ϰ� ��� ����
				Client client=new Client(s);
				client.start(); // ��Ž���!
			}
		} catch (Exception e) {}
	}
	
	// ����� �����ϰ� �����
	class Client extends Thread
	{
		//Ŭ���̾�Ʈ�� ���� ����
		Socket s;
		//�۽�, ����
		OutputStream out;
		BufferedReader in;
		//Ŭ���̾�Ʈ�� �⺻ ����
		String id, name, sex;
		public Client(Socket s)
		{
				//������ �������� �켱����
				//������ ==> ��������,�Ű����� ==> �������(������� ��� -> this.������)
			try {
				//Ŭ���̾�Ʈ�� ���� -> Connection(����Ŭ)
				this.s=s;
				// Ŭ���̾�Ʈ�� ������ ����(��) -> PreparedStatement => SQL
				out=s.getOutputStream();
				//Ŭ���̾�Ʈ�� ��û���� ���� ��� -> ResultSet 
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				/*
				 *  out=s.getOutputStream(); => HttpServletResponse
				 *  in=new BufferedReader => HttpServletRequest
				 */
			}catch(Exception ex) {}
		}
		// ��� (syncronized => ����ȭ)
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("client=>"+msg);
					//Ŭ���̾�Ʈ ��û�� ������
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					// 100|id|name|sex
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							//LOGIN : ���̺� ���
							
							//�߰�
							waitVc.add(this);
							//ȭ�� ���� : �α���-->����
							messageTo(Function.MYLOG+"|"+id);
							//MYLOG : �α���â ���� => ������ ����
							
							//�̹� ������ ������� ���� �ޱ�
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex);
							}
						}
						break;
						case Function.CHAT:
						{
							messageAll(Function.CHAT+"|["+name+"]"+st.nextToken());
						}
						break;
						case Function.EXIT:
						{
							String mid=id;
							messageAll(Function.EXIT+"|"+mid);
							// EXIT => ���� ���̺��� id�� ����
							
							//����
							for(Client user:waitVc)
							{
								if(user.id.equals(id))
								{
									messageTo(Function.MYEXIT+"|");
									waitVc.remove(user);
									in.close();
									out.close(); // ����ߴ�
									
									break;
								}
							}
						}
						break;
						
					}
				}
			}catch(Exception ex) {}
		}
		// ��ü������  �޼��� ����
		public void messageAll(String msg)
		{
				for(Client user:waitVc)
				{
					try {
						user.messageTo(msg);
					} catch (Exception e) {
						waitVc.remove(user);
					}
					
				}
		}
		
		// ���������� �޼��� ����
		public void messageTo(String msg)
		{
			try {
				out.write((msg+"\n").getBytes());
				// ���ڵ� -> ���ڵ� => UTF-8
			}catch(Exception ex) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server(); // ��������
		new Thread(server).start();		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
