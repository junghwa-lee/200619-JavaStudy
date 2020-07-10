/*
 *     클래스
 *     1. 구성요소
 *        1) 변수  => 기본형, 참조형(String)
 *        2) 메소드 : 기능처리 (연산자, 제어문)
 *        3) 생성자 : 선언한 변수에 대한 초기값 => 존재하지 않을 수 있음
 *          -----
 *            특징)
 *              ① 클래스명과 동일
 *              ② 리턴형이 없음
 *              ③ 생성자는 여러 개 있을 수 있음 => 오버로딩
 *                ** 오버로딩
 *                  - 같은 이름의 메소드
 *                  - 한 개의 클래스 안에서 제작
 *                  - 매개변수의 갯수나 데이터형이 다르다
 *                  - 리턴형은 상관 없음
 *              ④ 역할
 *                - 클래스를 메모리에 저장할 경우 반드시 호출되어야 함
 *                - 멤버변수의 초기값 담당
 *                   = 윈도우, 네트워크, 쓰레드, 데이터베이스 연결
 *                  
 *                ** 클래스 영역
 *                public class MainClass
 *                {
 *                		-> 제어문, 연산처리 기능을 수행할 수 없음
 *                     		=> { }안에서 작업이 가능  ==> 메소드(생성자메소드)
 *                		-> 변수 선언만 가능
 *                         ------
 *                          - 기본형
 *                          - 클래스
 *                          - 배열
 *                }
 *                ※ 클래스 영역 안에서는 [구현, 선언] 중 선언만 가능 
 *                   구현 => 연산, 제어문 라이브러리 => 메소드(선언->지역변수)안에서만 사용 (클래스 x)
 *                   선언 => 클래스, 메소드 모두 사용( 클래스 영역 안에서는 선언만 가능  )
 *                   		int a=10; , String s="";
 *                   
 *                	변수 : 저장, 변경, 읽기
 *                 		 => 1개, 여러 개 저장(배열, 클래스 ==> 변수의 일종)
 *                	객체 : 내가 만든 데이터형의 변수 => 여러 개 저장 가능
 *            
 *        --------------------------------------------------------------
 *        class에 변수 선언
 *          1) 멤버변수(인스턴스변수) : 따로 저장해서 사용하는 변수
 *          2) 공유변수(클래스변수, 정적변수) : 한 개만 저장해서 공통적으로 사용하는 변수
 *              -> static
 *        
 *        class에서 만드는 메소드
 *          1) 인스턴스메소드 : 따로 저장되는 메소드
 *          2) 정적메소드(static) : 공통으로 사용하는 메소드
 *          3) 생성자메소드 : 저장에 필요한 메소드 ==> 생성자는 static이 없다
 *             class A
 *               => A() =====> default 생성자
 *               => A(int a)
 *               => A(double d)
 *               => A(int a, int b)
 *             
 *             class A
 *             {
 *             		//생성자가 없는 경우에 가상머신이 자동으로 default생성자를 추가한다
 *              	//생성자가 아예 없는경우만 가능. 만약 다른 생성자가 있으면 자동으로 추가하지 않음 -> error
 *             }
 *               ==> A a=new A();
 *             class A
 *             {
 *             		A(){
 *             		}
 *             }
 *               ==> A a=new A(); 
 *             class A
 *             {
 *             		A(int a){
 *             		}
 *             }
 *               ==> A a=new A(10);               
 */
// 초기값 설정
/*
 *   class
 *   {
 *   	int a;
 *   	int b;
 *   }
 *   ===========> a=0, b=0
 *   
 *   class A
 *   {
 *   	int a=10;
 *   	int b=20;
 *   }
 *   ===========> a=10, b=20
 *   
 *   class A
 *   {
 *   	int a,b;
 *   	A()
 *   	{
 *   		a=100;
 *   		b=200;  ==> 구현이 가능
 *   	}
 *   }
 *   ============> a=0, b=0 ==> a=100, b=200
 *   
 *   class A
 *   {
 *   	int a;
 *   	int b;
 *    	생성자를 이용하지 않는 방법
 *    	
 *    	{
 *    		a=1000;
 *    		b=2000;   ==> 구현이 가능
 *    	} ====> 초기화 블록
 *    }
 *    ============> a=0, b=0
 *   }
 */
import javax.swing.*;
public class MainClass {
	/*
	JComboBox box=new JComboBox();
	// MainClass()
	{
		box.addItem("영화");
		box.addItem("음악");
		box.addItem("맛집");
	}// 생성자 사용x => 괄호 안에서 구현 가능(초기값) => 초기화 블럭
	*/
	
	String book="Java의 정석"; // 인스턴스 변수 => 저장x -> new 필요
	String author="남궁성"; // 인스턴스변수 => 저장x -> new 필요
	static String publisher="도우출판"; //클래스변수 => 저장o
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스변수(멤버변수) => 객체생성 후 사용
		MainClass m=new MainClass(); // [객체생성] 'm'안에 book, author 저장 ==> m.book ,m.author
		System.out.println("책이름:"+m.book);
		System.out.println("저자:"+m.author);
		
		// 클래스변수(공유변수) => 객체생성 없이 바로사용 (클래스이름.클래스변수)
		System.out.println("출판사:"+MainClass.publisher); // 권장
		System.out.println("출판사:"+m.publisher);
		System.out.println("출판사:"+publisher);
		/*
		 *  static => 클래스 명을 통해 접근 가능 MainClass.publisher
		 *  	   => 객체를 통해서 접근 가능 m.publisher
		 *  	   => '같은 클래스'에 있는 경우에는 publisher
		 *             class A
		 *             {
		 *             		static int a;
		 *             }
		 *             class B
		 *             {
		 *                 B()
		 *                 {
		 *                 		System.out.println(a) ==> 오류
		 *                 		System.out.println(A.a)
		 *                 		다른 클래스 안에서는 => 클래스명.변수명
		 *                 }
		 *             }
		 *         
		 *   공유변수 vs 인스턴스변수
		 *     - 공유변수(static) => 자동으로 메모리에 저장
		 *     - 인스턴스변수 => new를 이용해서 메모리 공간을 만들고 저장 ==> 반드시 new 사용!
		 *       ※  스프링은 new 사용X => 리플렉션
		 *     
		 *  
		 */
	}

}
