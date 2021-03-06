package com.sist.ab;
/*
 *  1. 클래스 종류
 *    1) 일반클래스(핵심)
 *       형식)  public class className
 *       	  {
 *                멤버변수, 공유변수
 *                생성자
 *                메소드
 *            }
 *            ① 데이터형으로만 사용
 *               => 필요한 데이터를 모아서 관리(캡슐화) => 데이터를 은닉화하고 메소드를 통해 접근
 *               							   ----------    ------------
 *               								private		 getter/setter
 *            ② 액션 
 *              => 기능만 가지고 있음 (=메소드)
 *            ③ 변수 + 메소드 = 혼합
 *    ===========================================================================
 *    2) 추상클래스
 *       형식)  public abstract class className
 *            {
 *                멤버변수 / 공유변수
 *                구현이 안 된 메소드 => 미완성 클래스
 *                구현이 된 메소드
 *            }
 *            ① 자신이 메모리 할당이 불가능
 *            ② 생성 => 상속받은 클래스를 통해서 메모리에 저장
 *            ③ 단일 상속
 *            ④ 상속 받은 클래스는 반드시 구현이 안 된 메소드를 구현해서 사용
 *            ⑤ 여러 개 클래스가 있는 경우 => 공통으로 적용된 메소드가 있는 경우에 추상 클래스 제작
 *            ⑥ 구분 -> 메모리 할당 -> 클래스 선언 = 생성자
 *              A a=new A()
 *              A a=new B()
 *            ⑦ 메소드 구현이 애매한 경우(경우의 수가 많다)
 *            ⑧ 기본 틀이 제작 => 구현이 쉽다
 *            ⑨ 요구사항 분석
 *            
 *    3) 인터페이스 : 웹프로그램 
 *        1 추상클래스의 일종
 *        2 다중 상속 가능
 *          interface A
 *          class B
 *          class C extends B implements A
 *          
 *          interface A
 *          interface B
 *          class C implements A,B
 *         => 여러 개의 관련 없는 클래스를 연결해서 사용하는 프로그램
 *         => 결합성(다른클래스 영향?)이 낮은 프로그램을 만들 때 주로 사용(spring)
 *        3 형식)  public interface interfaceName
 *                {
 *                    변수 : 상수형 변수 ==> public final static 데이터형=값
 *                                     -------------------
 *                                     생략시에는 자동으로 추가(private, protected 사용X)
 *                    메소드 : 구현이 안 된 메소드만 가지고 있다
 *                     ※ JDK 1.8이상 ==> default => 구현된 메소드 작성 가능     
 *                }
 *        4 인터페이스 => 클래스(상위클래스) => 상속을 내려야 사용 가능
 *          - 인터페이스는 클래스로부터 상속 받을 수 없다
 *            - 인터페이스 -> 인터페이스  : extends
 *            - 인터페이스 -> 클래스 : implements
 *    ============================================================> 관련된 클래스가 여러 개 -> 묶어서 사용(통합)
												                      = 데이터베이스 연결
												                      = 웹프로그래밍(MVC)
 *    4) 내부클래스 : 애플리케이션
 *        - 멤버클래스 : 두 개 이상의 클래스에서 한 개의 데이터를 공유할 경우
 *           		 네트워크 프로그램, 쓰레드 프로그램, 빅데이터
 *           class A
 *           {
 *               O, X, K 
 *           }
 *           class B
 *           {
 *           	 A a=new A();
 *           	 a.O, a.X, a.K
 *           }
 *             ==> B b=new B();  ==>
 *                 B b1=new B(); ==> a 객체가 따로 생성됨
 *                 
 *                 
 *           class A
 *           {
 *              O, X, K
 *              class B
 *              {
 *              }
 *           }
 *           
 *        - 익명클래스 : 상속받지 않고 오버라이딩(윈도우 클래스)
 *           class A
 *           {
 *           }
 *           class B
 *           {
 *           }
 *           class C extends A,B ==>  error
 *           {
 *           }
 *           
 *           class C extends A
 *           {
 *              B b=new B(){
 *                 오버라이딩 가능하다
 *              }
 *           }
 *           
 *           
 *           ※ 내부클래스
 *           class A
 *           {
 *              class B
 *              {
 *              }
 *           }
 *           =====>  B b=new B(); => 사용할 수 없음
 *           
 *           class C
 *           {
 *              B b=new B(); (x)
 *              A.B b; (o)
 *           }
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
