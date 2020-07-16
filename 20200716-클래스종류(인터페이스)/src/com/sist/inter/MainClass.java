package com.sist.inter;
/*
 *   �������̽�
 *    -> �߻�ũ������ ����(�߻�Ŭ���� ������ ����)
 *    -> �̿ϼ��� Ŭ���� => �ڽ��� �޸� �Ҵ��� �� �� ����
 *    -> �߻� Ŭ����(���� ���), �������̽�(���� ���)
 *    -> ��� �޼ҵ尡 abstract => ���� ����
 *       ** JDK 1.8 => default�޼ҵ带 �̿��ؼ� �޼ҵ� ���� ����
 *    -> ���� (�߻�Ŭ���� : ������� , �������̽� : ����� ����)
 *        int a; (x) ==> int a=10;
 *    -> interface A
 *       {
 *           // ����
 *           int a=10; ==> JVM (public static final int a=10;)
 *            					===================>����
 *           // �޼ҵ�
 *           void aaa(); ==> JVM (public abstract void aaa();)
 *           				      ===============>����
 *           int bbb();
 *       }
 *       
 *       interface A
 *       {
 *       	void aaa();
 *       }
 *       => ����
 *       class B implements A
 *       {
 *        	public void aaa(){
 *          ======��
 *        	}
 *       }
 *       
 *       
 *       �������̵�
 *       1) ��Ӱ���
 *       2) �޼ҵ�� ����
 *       3) �Ű����� ����
 *       4) ������ ����
 *       5) ���������� => Ȯ��O, ���X
 *       
 *       public > protected > default > private
 *       
 *       ** �������̽��� ����� ��� �޼ҵ�� public ==> ������ public ���� �� ���� ��
 *       ** �������̽��� ����� ��� ������ public(���)   
 *       
 *       ���
 *       ===
 *       	�������̽� -> �������̽�   ==> extends
 *       	�������̽� -> Ŭ����        ==> implements
 *       	Ŭ���� -> �������̽�        ==> error(��� �Ұ���)
 *       
 *          interface A
 *             K L
 *          interface B extends A
 *             P => K L
 *          class C implements B
 *             P
 *             K
 *             L  ����
 *          --------------------------------------
 *          interface A
 *          interface B
 *          class C implements A,B ==> ���߻��
 *          --------------------------------------
 *          interface A
 *          class B
 *          class C extends B implements A ==> ���߻��
 *          
 *          �������̽��� ��� �޼ҵ尡 ������ �ȵȴ�
 *          
 *       		
 */
interface ����{
	void eat();
	// ������ �޼ҵ带 ����(JDK
	//void run(); //����x => ����
	default void run() {
		System.out.println("�׹߷� �ȴ´�");
	}
}
class �� implements ���� {
	public void eat() {
		System.out.println("�Ұ��� �Դ´�");
	}
}
class �� implements ���� {
	public void eat() {
		System.out.println("������ �Դ´�");
	}
}
class ��� implements ����{

	@Override
	public void eat() {
		System.out.println("������ �Դ´�");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ι߷� �ȴ´�  ");
	}
	
}
class ���� implements ���� {
	public void eat() {
		System.out.println("����	���� �Դ´�");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� ani=new ��();
		ani.eat();
		ani=new ��();
		ani.eat();
		ani=new ����();
		ani.eat();
	}

}
