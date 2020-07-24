package com.sist.util;
//java.util : ���α׷����� ���� ����ϴ� Ŭ������ ����
//java.util => �ݵ�� import ���
/*
 *   Random
 *   StringTokenizer
 *   Date
 *   Calendar
 *   ArrayList, Vector
 *   HashMap
 *   ==================
 *     - regex
 *     - reflect
 */

import java.util.Random;

public class MainClass {
	/*
	 *   Random() => ����(������ ���� ��ǻ�Ͱ� ����)
	 *   ========
	 *     ���� 
	 *      nextInt()  => ~21�� 4õ(int����) 
	 *      nextInt(int n) ==> �����ε�  => ������ ����(0~n-1) ���̿��� ���� �߻�
	 *         ex) nextInt(100) => 0~99 
	 *      =============================== > static�� �ƴ�
	 *        static => Random.nextInt()
	 *        instance => Random r=new Random();
	 *       			  r.nextInt()
	 *        // static : �����ϰ� ���ÿ� ����
	 *        // instance : �޸� �Ҵ��(new ������())�� ����
	 *           		 
	 */
	public void random()
	{
		Random r=new Random();
		int a=r.nextInt(101); //0~100  
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		MainClass m=new MainClass(); // m-> random() ����
		m.random();
		MainClass m1=new MainClass(); // m1-> random() ����
		m1.random();
		// ===> m�� m1 ���� �۵� (�ν��Ͻ��޼ҵ�)
		// MainClass.random(); ==> static �޼ҵ�
		// ����� ���� �޼ҵ�� �ڵ� ȣ���� ����
	}

}
