package com.sist.lang;
class Change
{
	int x,y;
}
/* Change => x=0 ,y=0 
 *   ※멤버변수 : 0값으로 자동초기화 , 지역변수는 초기화설정필요!
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
	 *    => 목표 : x와 y값 교차 변경
	 *    	      ==> 임시변수(temp) 필요
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
		System.out.println("변경전:x="+x+",y="+y);
		m.swap(x,y);
		System.out.println("변경후:x="+x+",y="+y); // swap의 변수x,y와 메모리가 다르므로 값이 변경되지 않는다
		
		Change ccc=new Change();   //Call By Reference
		System.out.println(ccc); //c와 메모리주소가 같음
		ccc.x=10;
		ccc.y=20;
		System.out.println("변경전:c.x="+ccc.x+",c.y="+ccc.y);
		m.swap2(ccc);  
		System.out.println("변경후:c.x="+ccc.x+",c.y="+ccc.y); 
	}

}
