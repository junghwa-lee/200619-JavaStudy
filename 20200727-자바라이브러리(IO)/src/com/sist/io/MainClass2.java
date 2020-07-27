package com.sist.io;
// ���Ͽ� ���� => ȸ������, ���, �Խ���
/*
 *   ���� -> ���� -> ArrayList
 *   ������ -> ArrayList�� ��Ƽ� -> ����
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	 ���� �����
		 *    r => read
		 *    w => write ==> create
		 *    a => append
		 *     
		 * 
		 *   FileOutputStream (1byte)
		 *   ������
		 *     new FileOutputStream("��θ�")
		 *     new FileOutputStream("��θ�",true/false) => false�� default��
		 *   FIleWriter(2byte)
		 */
		//FileOutputStream fos=null;
		FileWriter fos=null;
		try
		{
			//����
			//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
		
			//����
			String str="ABCDEFGHIJKLMNOP";
			//fos.write('L');
			//fos.write('M');
			//fos.write('N');
			//fos.write(str.getBytes());
			fos.write(str+"\r\n"); // FileWriter�� ��� 

			/*
			 *  ���ڸ� �ٲٸ� ���Ӱ� ����(�����)
			 *  ���ϸ� �ڿ� true�� �����ϸ� ���� ���Ͽ� ���ٿ� ������ (append)
			 *  getBytes() : ���ڿ��� ����Ʈ �迭�� ������ �� ���
			 *  "\r\n" : �����ٿ� ���
			 */
			
			 System.out.println("����Ϸ�!!");
		}catch(Exception ex)
		{
			//����ó��
			System.out.println(ex.getMessage());
		}
		finally
		{
			// ���� �ݱ�
			// finally ==> ���ϴݱ� , �����ݱ�, ����Ŭ �������� 
			try
			{
				fos.close();
			}catch(Exception ex) {}
		}
		
		
		
		
		
		
		
		
	}

}
