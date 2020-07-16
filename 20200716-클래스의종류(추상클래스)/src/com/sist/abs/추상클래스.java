package com.sist.abs;
/*
 *   클래스의 종류
 *     - 추상클래스
 *     - 인터페이스 : 추상클래스를 확장
 *                여러 개의 클래스를 모아서 관리(서로 다른 클래스 연결해서 사용)
 *                ** 결합성이 낮은 프로그램
 *                   ----
 *                   - 결합성 : 클래스를 수정하면 다른 클래스 영향?
 *                   - 응집성 : 한 개의 기능을 수행할 수 있는 능력(메소드)
 *                ** 주로 사용 용도
 *                   1) 기능이 여러 개로 나눠지는 경우
 *                     ex) 버튼 -> 로그인, 취소, 퍼즐, 시작, 종료 
 *            	     2) 여러 개의 클래스를 한 개의 클래스로 제어
 *     ===================================================
 *     ※ 추상클래스&인터페이스 : 같은 역할
 *     
 *     다른점
 *     ----------------------------------------
 *     		 	 추상클래스			   인터페이스
 *     ----------------------------------------
 *     상속		단일 상속			다중 상속
 *     구현		구현이 안된 메소드		구현이 안 된 메소드만 가짐
 *     			구현이 된 메소드
 *     
 *     형식	<추상클래스>
 *     		public abstract class A
 *     		{
 *     			public abstract void display();
 *     			public void aaa()
 *     			{
 *     			}
 *     		}	
 *     
 *     		<인터페이스>
 *          public interface B
 *          {
 *          	void display(); ==> public abstract void display();
 *          	void aaa();     ==> public abstract void aaa();
 *          }
 *     
 *     멤버변수 <추상클래스>
 *     		 public abstract class A
 *           {
 *           	private int a;
 *           }
 *           
 *           <인터페이스>
 *           public interface B
 *           {
 *           	int a; ==> error!
 *           	※ 인터페이스가 가지고 있는 변수 => 상수형 변수
 *                int a; ==> (public final static) int a; ==> 변수 값 지정해야 함
 *                int a=10;
 *           }
 *           ==> 단점 : 기능설정 => 추가하면 모든 클래스가 error
 *     		 ==> 인터페이스, 추상클래스를 사용 ==> 상속
 *     			  반드시 구현이 안 된 메소드는 구현해서 사용 (필요없어도 구현 해야함)
 *     			 (구현된 메소드 : default =>1.8버전~)
 *           
 *           예) public interface A
 *              {
 *              	public void aaa();
 *              	public void bbb();
 *              }
 *              
 *              class B implements A 
 *              {
 *              	public void aaa(){}
 *              	public void bbb(){}
 *              }
 *              
 *     
 *     
 *     - 내부클래스 => 멤버클래스
 *     - 내부클래스 => 익명클래스 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 추상클래스 extends JFrame implements MouseListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// 필요 없어도 빈괄호{}로 모든 메소드를 구현해야함 (단점)

}
