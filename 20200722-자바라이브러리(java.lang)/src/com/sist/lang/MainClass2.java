package com.sist.lang;
class Change
{
	int x,y;
}
/* Change => x=0 ,y=0 
 *   �ظ������ : 0������ �ڵ��ʱ�ȭ , ���������� �ʱ�ȭ�����ʿ�!
 *   int -> 0
 *   double -> 0.0
 *   boolean -> false
 *   String -> null
 *   class -> null
 */
public class MainClass2 {
	/*
	 *    int x=10;
	 *    int y=20;
	 *    => ��ǥ : x�� y�� ���� ����
	 *    	      ==> �ӽú���(temp) �ʿ�
	 */
	public void swap2(Change c)
	{
		System.out.println(c);
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public void swap(int x, int y)
	{
		int temp=x;
		x=y;
		y=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("������:x="+x+",y="+y);
		m.swap(x,y);
		System.out.println("������:x="+x+",y="+y); // swap�� ����x,y�� �޸𸮰� �ٸ��Ƿ� ���� ������� �ʴ´�
		
		Change ccc=new Change();   //Call By Reference
		System.out.println(ccc); //c�� �޸��ּҰ� ����
		ccc.x=10;
		ccc.y=20;
		System.out.println("������:c.x="+ccc.x+",c.y="+ccc.y);
		m.swap2(ccc);  
		System.out.println("������:c.x="+ccc.x+",c.y="+ccc.y); 
	}

}
