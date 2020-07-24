package com.sist.collection;

import java.util.ArrayList;

/*
 *   Collection 
 *   =========== �ڷᱸ��
 *   �޸� �����ؼ� ���� ���ϰ� ��� ����   => ������ => �迭
 *   => ���Ǵ� ���α׷� : �����=> CURD -> ���� : �޸� 
 *   										��� ������ ������ ����  -> ���������������� ���� �ʿ�
 *      CURD => �б�, ����, ����, ���� ���尹��
 *      ���̺귯�� => ��� ������ ���� => ǥ��ȭ
 *      �б� : get()
 *      ���� : size()
 *      ���� : set()
 *      ���� : remove()
 *      ���� : add()
 *   ����
 *    1) ������ ���� �ߺ��� ������ �߰�   
 *       List(�������̽�) ==========> �����ͺ��̽�
 *         => ������ Ŭ����
 *            ArrayList**  : �񵿱�
 *            Vector**   : ����ȭ
 *            LinkedList
 *            Queue
 *            Stack
 *    2) ������ ���� �ߺ��� ���� ������ �߰� ===> Ž����
 *    	 Set
 *        	  HashSet
 *            TreeSet
 *    3) Ű, ������ ==> �� ���� ���ÿ� ���� ===> Ŭ���� ����
 *       Map
 *            Hashtable
 *            HashMap**
 *  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		/*
		//�߰�
		list.add(10);//0
		list.add(10.5);//1
		list.add("ȫ�浿");//2
		list.add('A');//3
		//���б�
		int a=(int)list.get(0);
		double d=(double)list.get(1);
		String s=(String)list.get(2);
		char c=(char)list.get(3);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c);
		*/
		
		list.add("ȫ�浿"); //0
		list.add("������");//1
		list.add("��û��");//2
		list.add("�̼���");//3
		list.add("�ڹ���");//4
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2); //2�� ���� => 3��->2�� ��ȣ�� �ڵ����� �ٲ� 
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
	
		list.add(1,"������"); // �ε�����ȣ =1�� ����                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
