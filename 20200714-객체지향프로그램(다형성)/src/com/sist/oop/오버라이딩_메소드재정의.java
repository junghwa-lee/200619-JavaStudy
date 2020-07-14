package com.sist.oop;

/*
 *  �������̵�
 *  =======
 *  1. �ݵ�� ��Ӱ��� 
 *  2. �޼ҵ�� ����
 *  3. �Ű����� ���� (����, ��������)
 *  4. ������ ����
 *  5. ����������� Ȯ�� O, ���X
 *     -------
 *     public > protected > default > private
 *     
 *      			 ���� Ŭ����		���� ����		�ٸ� ����		��� Ŭ����
 *        						(��Ű��)	   ����� �޴� ���	
 *     -----------------------------------------------------------
 *       public			O		  O			  O				O
 *       protected		O		  O		  	  O				X
 *       default		O		  O		  	  X				X
 *       private		O		  X		  	  X				X
 *     
 *     class A
 *     {
 *     	   private void display(){}
 *     }
 *     class B extends A
 *     {
 *         1. private void display(){}
 *         2. void display(){}
 *         3. protected void display(){}
 *         4. public void display(){}
 *     }
 *     
 *     class A
 *     {
 *     		private int a;
 *     		// setter/getter
 *     }
 */
public class �������̵�_�޼ҵ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
