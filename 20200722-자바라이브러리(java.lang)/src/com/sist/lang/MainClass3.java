package com.sist.lang;
class B
{
	int x,y;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Call By Value => 값을 전송 ==> 매개변수 전송법(메모리가 다른 메모리)
		int x=10;
		int y=20;
		
		int i=x;
		int j=y;
		
		int temp=i;
		i=j;
		j=temp;
		
		System.out.println("i="+i+",j="+j);
		System.out.println("x="+x+",y="+y); // x,y 값은 변경되지 않음
				
		// Call By Reference => 주소 전송
		
		B b=new B();
		b.x=10;
		b.y=20;
		B c=b; //참조 => swap(B c) ==> swap(b)
		c.x=100;
		c.y=200;
		System.out.println("b="+b);
		System.out.println("c="+c); //b와 c의 메모리주소가 같음
		System.out.println(b.x);
		System.out.println(b.y); //b값이 변경됨
		/*
		 *  매개변수 -> class,배열 ==> 원본(주소) -> 데이터 변경
		 *  매개변수 -> 기본형 데이터, String ==> 복사본 -> 원본값은 변경되지 않음
		 *  
		 *  ==> 메모리(클래스) => 같이사용(참조)
		 *  	메모리(클래스) => 이미 만들어진 클래스 사용 -> 복제(clone() )
		 *      메모리(클래스) => 새로운 내용(처음부터 사용) -> new
		 *   
		 */
	}

}
