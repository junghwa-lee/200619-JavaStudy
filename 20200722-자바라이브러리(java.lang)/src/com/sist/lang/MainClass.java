package com.sist.lang;
//import java.util.*;
//import java.sql.*;
/*
 *    <java.lang>
 *      - Object
 *         1) 최상위 클래스 -> 모든 데이터형을 포함
 *         	  class A
 *            Object obj=new A();
 *            Object obj=10.5;
 *            Object[] obj={new A(),10.5,100,'A',"Hello"}
 *         2) 모든 클래스(사용자 정의) => 상속을 내린다 
 *            ------------------ Object가 가지고 있는 모든 기능을 사용할 수 있다
 *         3) 주요 기능(메소드)
 *            clone() => prototype : 복제(메모리 복제) 
 *            
 *      - String
 *      - StringBuffer
 *      - System
 *      - Math
 *      - Wrapper : 모든 데이터형을 사용하기 쉽게 클래스로 변경
 *        ------
 *         Double  => double
 *         Byte    => byte
 *         Integer => int
 *         Boolean => boolean
 *         ================== > 박싱 / 언박싱
 *         Integer i=10  ==> 박싱
 *         Integer i=new Integer(10);
 *         int k=i;                   ==> 언박싱
 */
/*
 *   class A
 *   {
 *   	int a=10;
 *   }
 *   class B extends A
 *   {
 *       // int a;
 *       public B()
 *       {
 *       	this.a=100; // 자신의 클래스
 *          super.a=200; // 상속을 내린 클래스
 *       }
 *   }
 *   
 *   
 *   상속
 *    extends  ====> class로부터 상속    =====> 단일상속
 *    implements  => interface(클래스의 일종)로부터 상속  ====> 다중상속
 *    
 *    
 *    클래스
 *       1) new -> 처음부터 시작
 *       2) 참조 -> 클래스 -> 매개변수로 전송
 *          메소드를 통해서 전송
 *       3) 복제 -> 변경된 값부터 시작
 *       
 *       class A
 *       {
 *       	int aa=10;
 *       }
 *       
 *       A aaa=new A();
 *       ===> display(aaa); ==> aaa.aa=1000  : Call By Reference
 *       
 *       public void display(A a)
 *       {
 *       	a.aa=1000;
 *       }
 *       
 */
class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a=new A();
		try
		{
			a=(A) super.clone();  //clone의 리턴형 : Object ==> Object가 상위클래스이므로 형변환 필요
			/*
			 *   Object   
			 *   A
			 *   A a=(A)new Object();
			 *   
			 *   double d=10;
			 *   int a=(int)10.5;
			 */
		}catch(Exception e) {}
		return a;
	}
}
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util.Date date=new java.util.Date(); // util & sql 패키지에 date클래스 모두 포함 => 충돌 => 패키지 설정필요
		
		//new
		A a=new A(); //a.aa
		a.aa=100;
		A b=new A(); //b.aa
		System.out.println(b.aa); // a와 b는 따로 저장 => a랑 상관없이 b는 초기값으로 저장
		
		//참조 => 별칭, 같은 메모리를 참조
		A c=new A();
		c.aa=100;
		A d=c;
		System.out.println(d.aa); 
		d.aa=1000;
		System.out.println(c.aa); // c와 d는 동일 메모리에 저장 (같이 변경됨)
		
		//복제
		A e=c.clone();
		System.out.println(e.aa); // c의 변경된 값을 그대로 복제
	}

}
