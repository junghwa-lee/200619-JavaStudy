package com.sist.abs;
/*
 *   �߻� Ŭ����
 *    => �̿ϼ��� Ŭ����
 *    => new�� ����ؼ� �޸� �Ҵ��� �Ұ���
 *    	class A
 *        => A a=new A();
 *    	abstract class B
 *        => B b=new B(); ==> error
 *    => �׻� ����� ������ ���� Ŭ�������� ������ �� ���
 *    => �⺻ Ʋ�� ����   
 *       ex) �Խ����� ������
 *           �Խ��ǿ��� �۾���, ���뺸��, ����, ����, ã�� 
 *    => ���ø� �Ѵ�: �����ϴ� ������ ���α׷����� �ٸ� ���� �ִ�
 */
abstract class ����
{
	public abstract void draw();
	// ���� �� �޼ҵ� -> ���� ���� (�ָ��Ұ��) -> Ŭ�������� ���� �ʿ�
	// public void aaa(); => error ==> ������ ��� abstract 
	public void color()
	{
		System.out.println("���������� �׸��� �׸���");
	}
	// ������ �޼ҵ� -> ���ϴ� ��ġ���� ��� ����
}
class �ﰢ�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���");
	}
	
}
class �� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	
	// ���� ���� => ������

	@Override
	public void color() {
		System.out.println("���������� �׸��� �׸���");
	}
	
	
}
class �簢�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� �׸���");
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      ���� g=new �ﰢ��();
		      //���� g=new ����; ==> error
		   g.color();
		   g.draw();
		
		   g=new �簢��();
		   g.color();
		   g.draw();
		   
		   g=new ��();
		   g.color();
		   g.draw();
		   
		   //'����'Ŭ������ �ѹ��� ó��  ==> ���δٸ� Ŭ���� �������� ����
			
	}

}
