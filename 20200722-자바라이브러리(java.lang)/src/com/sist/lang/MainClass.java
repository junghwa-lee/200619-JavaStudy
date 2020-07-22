package com.sist.lang;
//import java.util.*;
//import java.sql.*;
/*
 *    <java.lang>
 *      - Object
 *         1) �ֻ��� Ŭ���� -> ��� ���������� ����
 *         	  class A
 *            Object obj=new A();
 *            Object obj=10.5;
 *            Object[] obj={new A(),10.5,100,'A',"Hello"}
 *         2) ��� Ŭ����(����� ����) => ����� ������ 
 *            ------------------ Object�� ������ �ִ� ��� ����� ����� �� �ִ�
 *         3) �ֿ� ���(�޼ҵ�)
 *            clone() => prototype : ����(�޸� ����) 
 *            
 *      - String
 *      - StringBuffer
 *      - System
 *      - Math
 *      - Wrapper : ��� ���������� ����ϱ� ���� Ŭ������ ����
 *        ------
 *         Double  => double
 *         Byte    => byte
 *         Integer => int
 *         Boolean => boolean
 *         ================== > �ڽ� / ��ڽ�
 *         Integer i=10  ==> �ڽ�
 *         Integer i=new Integer(10);
 *         int k=i;                   ==> ��ڽ�
 */
/*
 *   class A
 *   {
 *   	int a=10;
 *   }
 *   class B extends A
 *   {
 *       // int a;
 *       public B()
 *       {
 *       	this.a=100; // �ڽ��� Ŭ����
 *          super.a=200; // ����� ���� Ŭ����
 *       }
 *   }
 *   
 *   
 *   ���
 *    extends  ====> class�κ��� ���    =====> ���ϻ��
 *    implements  => interface(Ŭ������ ����)�κ��� ���  ====> ���߻��
 *    
 *    
 *    Ŭ����
 *       1) new -> ó������ ����
 *       2) ���� -> Ŭ���� -> �Ű������� ����
 *          �޼ҵ带 ���ؼ� ����
 *       3) ���� -> ����� ������ ����
 *       
 *       class A
 *       {
 *       	int aa=10;
 *       }
 *       
 *       A aaa=new A();
 *       ===> display(aaa); ==> aaa.aa=1000  : Call By Reference
 *       
 *       public void display(A a)
 *       {
 *       	a.aa=1000;
 *       }
 *       
 */
class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a=new A();
		try
		{
			a=(A) super.clone();  //clone�� ������ : Object ==> Object�� ����Ŭ�����̹Ƿ� ����ȯ �ʿ�
			/*
			 *   Object   
			 *   A
			 *   A a=(A)new Object();
			 *   
			 *   double d=10;
			 *   int a=(int)10.5;
			 */
		}catch(Exception e) {}
		return a;
	}
}
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util.Date date=new java.util.Date(); // util & sql ��Ű���� dateŬ���� ��� ���� => �浹 => ��Ű�� �����ʿ�
		
		//new
		A a=new A(); //a.aa
		a.aa=100;
		A b=new A(); //b.aa
		System.out.println(b.aa); // a�� b�� ���� ���� => a�� ������� b�� �ʱⰪ���� ����
		
		//���� => ��Ī, ���� �޸𸮸� ����
		A c=new A();
		c.aa=100;
		A d=c;
		System.out.println(d.aa); 
		d.aa=1000;
		System.out.println(c.aa); // c�� d�� ���� �޸𸮿� ���� (���� �����)
		
		//����
		A e=c.clone();
		System.out.println(e.aa); // c�� ����� ���� �״�� ����
	}

}
