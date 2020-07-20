package com.sist.exception;
/*
 *   ����ó��
 *      ����) 
 *        1. ����ó�� (try~catch)
 *           try
 *           {
 *           	������ ������ �ڵ� (���� ������ �� �ִ� ����)
 *           }catch(����Ŭ���� ��ü)
 *           {
 *           	���� ������ ������ �� ��쿡 ó�� ����
 *           }
 *           *** catch ������ ��� ����
 *           *** finally�� ����� �� �ִ� (�ʿ��� ��쿡�� ���)
 *               ����, �����ͺ��̽� ���� => �����ݱ�, ����Ŭ ���� ����..
 *         
 *        2. �ڹٿ��� �����ϴ� ����ó��
 *           �� ���� ó��
 *             NumberFormatException
 *             ArrayIndexOutOfBoundsException
 *             NullPointerException
 *             IOException
 *             SQLException
 *           ������ ó��
 *             RuntimeException : ����� ���� ��ü�� ��� �ѹ��� ó��
 *             Exception
 *             Throwable
 *        
 *        3. catch�� ���� ���� ����� �� ����
 *           �ش� ������ ã�� ��쿡�� ó������ ���������� �˻� => ����ó�� ������� �ڵ�
 *        
 *        4. try���� ������ �߻��ϸ� �߻���ġ���� catch�� �̵�
 *           ----------------------> �ؿ��ִ� �ҽ��� ������� ����
 *           int a=10;  ==> ����
 *           int b=0;   ==> ����
 *           int c=a/b; ==> ���� �߻�
 *           System.out.println(c)  ==> ����X
 *        
 *        5. ���� : ����üũ(����Ȯ�� -> �ҽ�����) ==> �����
 *        6. ����ó�� => ������ ������ ����
 *        
 *           1����
 *           2����
 *           try
 *           {
 *             3����
 *             4����  ===> error ==> ���α׷� ���� (������ ����)
 *             5����
 *                  ==> 4,5���� �ǳʶٰ� 6�������� �̵�
 *           }catch(Exception e)
 *           { 
 *             6����
 *           }
 *           7����
 *           8����
 *        
 *        7. �ڹ��� ��� �ڵ��� ����ó�� ����
 *           ��, ����ô� ���� ����
 *           
 *           void display()
 *           {
 *             return; => ���� ��� �ڵ��߰�
 *           }
 *           
 *           class A
 *           {
 *            	A(){} => ���� ��� �ڵ��߰�
 *           }
 *           
 *           => ������ �����ؾ������� ���� ==> ����ó��
 *           system.out.println() => ����ó�� ���� ����
 *           system.in.read() => ����ó�� ���� �Ұ�
 *           *** ������ �� �� ������ Ư���� ��쿡�� ����ó���� �� �� �˾ƾ� �Ѵ�
 *               ---
 *               ���ǹ����� �ַ� ó�� => ���ǹ����� ó���� ����� ��쿡 ����ó�� ���
 *               => ����ó���� �⺻ ���ǹ�
 *                
 *               int a=10;
 *               int b=0;
 *               if(b==0)
 *                 System.out.println("0���� ���� �� ����")
 *               else
 *                 System.out.println(a/b);
 *                 
 *               try
 *               {
 *                 	int a=10;
 *              	int b=0;
 *              	System.out.println(a/b);
 *               }catch(Exception e)
 *               {
 *                  System.out.println("0���� ���� �� ����")
 *               }
 *               
 *         8. ����ó���� �ݵ�� ó���ؾ��ϴ� Ŭ������ ����
 *            --------------
 *              IO�� ����
 *              ������� ����
 *              ��Ʈ��ũ ����
 *              �����ͺ��̽� ����  => Web�� ����
 */
import javax.swing.*;
public class MainClass {
	public static void main(String[] args) {
	    try
	    {
			String num1=JOptionPane.showInputDialog("ù��° ���� �Է�:");
			String num2=JOptionPane.showInputDialog("�ι�° ���� �Է�:");
			//�迭�� ÷��
			int[] arr=new int[2];
			// ���ڿ�-> ���� ��ȯ 
			arr[0]=Integer.parseInt(num1); // ���� => "10" (o) / "1 0" (X)
			arr[1]=Integer.parseInt(num2);
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
	    } 
	    /*catch(NumberFormatException e)
	    {
	    	System.out.println("������ �Է�");
	    }catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("�迭���� �ʰ�");
	    }catch(ArithmeticException e)
	    {
	    	System.out.println("0���� ���� �� ����");
	    }*/
	    catch(RuntimeException e) 
	    {
	    	//System.out.println(); // ==> ������ ��ġ�� �˱� �����
	    	//System.out.println(e.getMessage()); //���� �޽��� �˷���
	    	e.printStackTrace(); // =>���� �� ���� ������
	    }
	    System.out.println("ó������ �ٽ� �Է�!");
		
		
		
		
		      
	}
}
