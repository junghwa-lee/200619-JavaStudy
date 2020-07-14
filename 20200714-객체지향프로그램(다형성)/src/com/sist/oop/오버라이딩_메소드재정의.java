package com.sist.oop;

/*
 *  오버라이딩
 *  =======
 *  1. 반드시 상속관계 
 *  2. 메소드명 동일
 *  3. 매개변수 동일 (갯수, 데이터형)
 *  4. 리턴형 동일
 *  5. 접근지정어는 확장 O, 축소X
 *     -------
 *     public > protected > default > private
 *     
 *      			 같은 클래스		같은 폴더		다른 폴더		모든 클래스
 *        						(패키지)	   상속을 받는 경우	
 *     -----------------------------------------------------------
 *       public			O		  O			  O				O
 *       protected		O		  O		  	  O				X
 *       default		O		  O		  	  X				X
 *       private		O		  X		  	  X				X
 *     
 *     class A
 *     {
 *     	   private void display(){}
 *     }
 *     class B extends A
 *     {
 *         1. private void display(){}
 *         2. void display(){}
 *         3. protected void display(){}
 *         4. public void display(){}
 *     }
 *     
 *     class A
 *     {
 *     		private int a;
 *     		// setter/getter
 *     }
 */
public class 오버라이딩_메소드재정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
