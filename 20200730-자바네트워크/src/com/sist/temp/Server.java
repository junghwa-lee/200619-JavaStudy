package com.sist.temp;
/*
 *   ���� -> ip����
 *          Ŭ���̾�Ʈ���� ���� => �����ȣ(PORT)
 *          PORT => 0~65535 => �������PORT (0~1023)
 *            ��) HTTP : 80, SMTP : 25, FTP : 21, TELNET : 23
 *                Spring : 3000 , React : 3000, ����Ŭ : 1521, MS-SQL : 1433, �ӵ� : 4000
 *                => ���� : 20000 , ȭ�� : 30000
 *                
 *   ���� ���� 
 *     1) bind (IP+PORT)  => �ڵ��� ����
 *     2) ������ => listen
 *     3) ���� ��� => ���� ==> accept() : �߽�����ȭ��ȣ(IP)�� ����
 *     4) ���� => ����ȭ 
 *               ---- 
 *                ArrayList : �񵿱�ȭ
 *                Vector : ����ȭ
 *     5) ���������� : write()
 *     6) ����ں��� ��û : readLine()
 *     
 *   �������� �ϴ� ���� 
 *     1) ����� ��û �ޱ�
 *     2) ��ûó�� => ã��
 *     3) ������� ����ڿ��� ����
 *     
 *   ����
 *     1) 1:1 (Peer To Peer)
 *     2) 1:�� => ������ ����, ����ڰ� ���� ��û �� �� �ְ� �����
 *      		 => ����� ��û�� �޾Ƽ� ó���ϴ� ���α׷��� ����
 *       		 => ��� -> �������� (������)
 *       
 *   ==============================================
 *   ������
 *       => �ڿ��� ���� ȿ�������� ���
 *       => ����ڿ� ���� ���伺�� ���
 *       => �۾��� �и��ȴ�(�ҽ� ����ȭ)
 *       => CPU�� ȿ�������� ��� => �ӵ� ������
 *       => �������� ���α׷� => ���μ���(�����尡 1���̻� ����)
 *   
 *   �����带 �����ϴ� ���  
 *     1) �������̽�
 *        Runnable
 *        class A implements Runnable => ������
 *     2) Thread Ŭ���� ���
 *        class A extends Thread => �Ϲ� ������ 
 *   
 *   ������ �������
 *     ����			  	 ���(�����忡�� ����ϴ� �����ͼ���)		������ ����
 *     new Thread()    		     start()				 run()
 *     ==> �������� ���� ���� run()����
 *     ==> ������� �ݵ�� �� ���� ���۸� ����
 *         run() => ���� : interrupt() / �Ͻ����� : sleep(), wait(), join()
 *         
 *     
 */
class MyThread extends Thread
{
	//����
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(50); // 1/1000
				
			}
		} catch (Exception e) {}
	}
}
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();

		/*
		 ���� => JVM (�������� => 1~10 ) => ����� ���� ������(5)
		 1 : MIN_PRIORITY, 10: MAX_PRIORITY, 5: NORM_PRIORITY
		 �� �����帶�� �̸� �ο� Thread-0, Thread-1....
		 �ڹ����α׷��� MAX_PRIORITY(main), MIN_PRIORITY(gc)
		*/
		
		//run ȣ�� => start()ȣ���ϸ� �ڵ����� run()ȣ���
		// start�� ��� ���� ���� �������� ȣ��
		// �ѹ��� ���� => ������ �Ź� �ٲ��
		
		//�̸��ο�
		t1.setName("����");
		t2.setName("�λ�");
		t3.setName("����");
		
		//�����ο�
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
