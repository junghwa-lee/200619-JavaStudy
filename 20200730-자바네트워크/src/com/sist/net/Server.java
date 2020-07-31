package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *    ��������
 *      ServerSocket(Socket=��ȭ��)
 *    ���ӽÿ� ó��
 *      accept()
 *    ���
 *      write()
 *      read()
 *      
 */
public class Server implements Runnable{
	//���� �޴� Socket => ��ȯ ����
	ServerSocket ss=null;
	//���� ����
	//�Ѱ��� ��ǻ�Ϳ����� ���� �� ���� ������ �Ұ���
	//������ ���� ����
	Vector<Client> waitVc=new Vector<Client>();
	public Server()
	{
		try
		{
			ss=new ServerSocket(5353); //bind(ip,port) -> listen()
			//��������
			System.out.println("Server Start!!");
		}catch(Exception ex) {}
	}
	// ���ӽÿ� ó��
	public void run()
	{
		try {
			while(true)
			{
				Socket s=ss.accept(); //������ ���� ��� => �������� IP, PORT Ȯ��
				// IP, PORT => Socket(�߽�������)
//				System.out.println("������ IP:"+s.getInetAddress().getHostAddress());
//				System.out.println("�������� PORT(���ἱ):"+s.getPort());
				Client c=new Client(s); // �����ڿ� ������ ����
				waitVc.add(c); //Ŭ���̾�Ʈ ����
				c.start();// �����ڿ� ��� ����
			}
		} catch (Exception e) {}
		
	}
	//�����ڸ��� ���� ��� ����
	class Client extends Thread
	{
		Socket s; // ������ Ŭ���̾�Ʈ�� ����
		OutputStream out; // Ŭ���̾�Ʈ�� ����� ����
		BufferedReader in; // Ŭ���̾�Ʈ ��û�ÿ� ���� �޴� Ŭ����
		
		public Client(Socket s) //����Ŭ����
		{
			try {
				this.s=s; // s=> Ŭ���̾�Ʈ  //�������� Ŭ������ ��ģ��-> this				
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
		}
		//��Ž���
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine(); //ä�ù��ڿ� �ޱ�
					for(Client user:waitVc)
					{
						user.out.write((msg+"\n").getBytes()); // getbytes : ���ڵ�
						//��Ʈ��ũ :1byte => ���� ��(�ѱ�����) => 2byte�� ��ȯ�ؾ���
						//Stream(1byte) => Reader(2byte)
					}
					
				}
			}catch(Exception ex) {}
		}
	}
	public static void main(String[] args) {
		Server server=new Server(); // ��������
		new Thread(server).start(); // ����ó�� => ������ ��ٸ���
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
