package com.sist.abs;
/*
 *   Ŭ������ ����
 *     - �߻�Ŭ����
 *     - �������̽� : �߻�Ŭ������ Ȯ��
 *                ���� ���� Ŭ������ ��Ƽ� ����(���� �ٸ� Ŭ���� �����ؼ� ���)
 *                ** ���ռ��� ���� ���α׷�
 *                   ----
 *                   - ���ռ� : Ŭ������ �����ϸ� �ٸ� Ŭ���� ����?
 *                   - ������ : �� ���� ����� ������ �� �ִ� �ɷ�(�޼ҵ�)
 *                ** �ַ� ��� �뵵
 *                   1) ����� ���� ���� �������� ���
 *                     ex) ��ư -> �α���, ���, ����, ����, ���� 
 *            	     2) ���� ���� Ŭ������ �� ���� Ŭ������ ����
 *     ===================================================
 *     �� �߻�Ŭ����&�������̽� : ���� ����
 *     
 *     �ٸ���
 *     ----------------------------------------
 *     		 	 �߻�Ŭ����			   �������̽�
 *     ----------------------------------------
 *     ���		���� ���			���� ���
 *     ����		������ �ȵ� �޼ҵ�		������ �� �� �޼ҵ常 ����
 *     			������ �� �޼ҵ�
 *     
 *     ����	<�߻�Ŭ����>
 *     		public abstract class A
 *     		{
 *     			public abstract void display();
 *     			public void aaa()
 *     			{
 *     			}
 *     		}	
 *     
 *     		<�������̽�>
 *          public interface B
 *          {
 *          	void display(); ==> public abstract void display();
 *          	void aaa();     ==> public abstract void aaa();
 *          }
 *     
 *     ������� <�߻�Ŭ����>
 *     		 public abstract class A
 *           {
 *           	private int a;
 *           }
 *           
 *           <�������̽�>
 *           public interface B
 *           {
 *           	int a; ==> error!
 *           	�� �������̽��� ������ �ִ� ���� => ����� ����
 *                int a; ==> (public final static) int a; ==> ���� �� �����ؾ� ��
 *                int a=10;
 *           }
 *           ==> ���� : ��ɼ��� => �߰��ϸ� ��� Ŭ������ error
 *     		 ==> �������̽�, �߻�Ŭ������ ��� ==> ���
 *     			  �ݵ�� ������ �� �� �޼ҵ�� �����ؼ� ��� (�ʿ��� ���� �ؾ���)
 *     			 (������ �޼ҵ� : default =>1.8����~)
 *           
 *           ��) public interface A
 *              {
 *              	public void aaa();
 *              	public void bbb();
 *              }
 *              
 *              class B implements A 
 *              {
 *              	public void aaa(){}
 *              	public void bbb(){}
 *              }
 *              
 *     
 *     
 *     - ����Ŭ���� => ���Ŭ����
 *     - ����Ŭ���� => �͸�Ŭ���� 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class �߻�Ŭ���� extends JFrame implements MouseListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// �ʿ� ��� ���ȣ{}�� ��� �޼ҵ带 �����ؾ��� (����)

}
