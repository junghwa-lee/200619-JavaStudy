package com.sist.exception;
//�κ� ó��
public class MainClass3 {
	public static void main(String[] args) {
		//�κ������� try ����� �� �ִ�
		try
		{
			for(int i=1;i<=10;i++)
			{
				try
				{
					System.out.println("i="+i);
					int a=i/(int)(Math.random()*3); // random���� 0�̸� error�߻� 
					System.out.println("a="+a);
				}catch(Exception e) {System.out.println("for�� i++�� �̵�");} // for�� �ȿ� try~catch => ������ i=10���� ����
			}
		}catch(Exception ex)
		{
			System.out.println("�����߻�");			
		}
		System.out.println("���α׷� ���� ����!!");
		
		
	
	}
}
