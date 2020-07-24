package com.sist.util;
//java.util : 프로그램에서 많이 사용하는 클래스의 집합
//java.util => 반드시 import 사용
/*
 *   Random
 *   StringTokenizer
 *   Date
 *   Calendar
 *   ArrayList, Vector
 *   HashMap
 *   ==================
 *     - regex
 *     - reflect
 */

import java.util.Random;

public class MainClass {
	/*
	 *   Random() => 난수(임의의 수를 컴퓨터가 결정)
	 *   ========
	 *     정수 
	 *      nextInt()  => ~21억 4천(int범위) 
	 *      nextInt(int n) ==> 오버로딩  => 지정된 범위(0~n-1) 사이에서 난수 발생
	 *         ex) nextInt(100) => 0~99 
	 *      =============================== > static이 아님
	 *        static => Random.nextInt()
	 *        instance => Random r=new Random();
	 *       			  r.nextInt()
	 *        // static : 컴파일과 동시에 저장
	 *        // instance : 메모리 할당시(new 생성자())에 저장
	 *           		 
	 */
	public void random()
	{
		Random r=new Random();
		int a=r.nextInt(101); //0~100  
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		MainClass m=new MainClass(); // m-> random() 저장
		m.random();
		MainClass m1=new MainClass(); // m1-> random() 저장
		m1.random();
		// ===> m과 m1 따로 작동 (인스턴스메소드)
		// MainClass.random(); ==> static 메소드
		// 사용자 정의 메소드는 자동 호출이 없다
	}

}
