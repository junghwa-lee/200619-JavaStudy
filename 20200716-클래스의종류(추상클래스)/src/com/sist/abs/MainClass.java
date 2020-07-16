package com.sist.abs;
/*
 *   추상 클래스
 *    => 미완성된 클래스
 *    => new를 사용해서 메모리 할당이 불가능
 *    	class A
 *        => A a=new A();
 *    	abstract class B
 *        => B b=new B(); ==> error
 *    => 항상 상속을 내려서 하위 클래스에서 구현한 후 사용
 *    => 기본 틀이 존재   
 *       ex) 게시판을 만들어라
 *           게시판에는 글쓰기, 내용보기, 수정, 삭제, 찾기 
 *    => 제시만 한다: 구현하는 내용이 프로그램마다 다를 수도 있다
 */
abstract class 도형
{
	public abstract void draw();
	// 선언만 된 메소드 -> 따로 구현 (애매할경우) -> 클래스마다 구현 필요
	// public void aaa(); => error ==> 선언할 경우 abstract 
	public void color()
	{
		System.out.println("검정색으로 그림을 그린다");
	}
	// 구현된 메소드 -> 원하는 위치에서 사용 가능
}
class 삼각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
	// 정의 변경 => 재정의

	@Override
	public void color() {
		System.out.println("빨간색으로 그림을 그린다");
	}
	
	
}
class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      도형 g=new 삼각형();
		      //도형 g=new 도형; ==> error
		   g.color();
		   g.draw();
		
		   g=new 사각형();
		   g.color();
		   g.draw();
		   
		   g=new 원();
		   g.color();
		   g.draw();
		   
		   //'도형'클래스로 한번에 처리  ==> 서로다른 클래스 여러개를 묶음
			
	}

}
