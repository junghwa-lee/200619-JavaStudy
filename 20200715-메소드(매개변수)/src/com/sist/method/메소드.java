package com.sist.method;
/*
 *  => �޼ҵ�
 *     - ���ϰ�
 *     - �Ű����� : �ָ��� ���
 *       printf("%d%d%d",10,20,30)
 *       printf("%d",100)
 *       =========================> �����Ű�����
 *       String... a -> ������ �� �𸦰��
 *       Object... obj -> + ���������� �������� ���
 *       
 */
public class �޼ҵ� {
	public static void concat(String s, String... s1)
	{
		for(String ss:s1)
		{
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat("Hello","ȫ�浿","��û��","�ڹ���","������","�̼���");
		//Object : ��� �������� ����
		/*
		Object o=10;
		Object o1=0.5;
		Object o2='A';
		Object o3="aaaa";
		Object o4=new �޼ҵ�();
		*/	
	}

}
