package com.sist.temp;
import java.io.*;
import java.util.*; // '|' ���� �߶󳻱� -> split , StringTokenizer 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �б� => ����ó�� �ʿ�
		FileReader fr=null; 
		/*
		 *  ���Ͽ� ���� : FileWriter ==> ���� ��Ʈ�� (�ѱ� ����) => 2byte
		 *  		  FileInputStream, FileOutputStream => 1byte ( png, jpg, zip..)
		 */
		
		
		try
		{
			// �����б�
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			// �ѱ��� �б� => ������ ��ȣ -> char ��ȯ�� ���ڷ� ���
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			//���
			System.out.println(sb.toString());
		}catch(Exception ex)
		{
			// ���� ó�� => �����
			/*
			 *  ���� �޼��� Ȯ�� ..getMessage()
			 *  Trace => ������� => �ش���ġ ã��  ..printStackTrace() 
			 */
			ex.printStackTrace();
		}
		finally
		{
			// ���� �ݱ�, ������ ����, ��Ʈ��ũ ���� ����, ����Ŭ ���� ����
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
		
		
		
		
		
		
		
	}

}
