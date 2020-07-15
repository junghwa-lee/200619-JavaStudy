package com.sist.method;
class AA
{
   /*public display() //메소드 -> 반드시 리턴형 필요
	{
		
	}
	*/
	public void AA() // 생성자X -> 일반 인스턴스 메소드
	{
		System.out.println("AA() Call..");
		// void=>리턴형 (결과값 존재x)
	}
	public AA() // 생성자
	{
		System.out.println("AA() Call...");
	}
	// 생성자 => 리턴형이 존재하지 않음
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();
		a.AA();
	}

}
