package com.sist.method;
class AA
{
   /*public display() //�޼ҵ� -> �ݵ�� ������ �ʿ�
	{
		
	}
	*/
	public void AA() // ������X -> �Ϲ� �ν��Ͻ� �޼ҵ�
	{
		System.out.println("AA() Call..");
		// void=>������ (����� ����x)
	}
	public AA() // ������
	{
		System.out.println("AA() Call...");
	}
	// ������ => �������� �������� ����
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();
		a.AA();
	}

}
