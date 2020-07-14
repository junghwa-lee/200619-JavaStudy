/*
 *   클래스
 *     1) 변수 => 여러 개를 저장할 때 반드시 공통으로 들어가는 데이터
 *                           -------------------------> 추상화
 *         변수의 종류
 *          - 멤버변수(인스턴스변수) => new를 사용할 때마다 따로 저장되는 공간
 *         		** 메모리 만들어지는 시점 : new 이용할 때
 *         		** heap : 인스턴스변수가 생성되는 공간
 *         				    프로그래머가 관리하는 영역 (자동처리가 안된다)
 *         				    메모리를 사용하지 않을 경우 (직접처리, GC)
 *          - 공유변수(static변수) => 메모리 1개 => 공통으로 사용되는 변수
 *          	** 컴파일러가 컴파일할 떄  자동으로 생성
 *              ** 메소드영역(static, 메소드)
 *          ======================================================
 *          - 지역변수 => 지역변수 , 매개변수
 *              ** 메모리 생성 시점 : 메소드 호출 시
 *              ** 메모리가 자체관리 {} 벗어나면 자동 회수 ==> stack(LIFO)
 *         
 *         변수설정 : 초기값
 *          - 선언과 동시에 값 주입
 *          - 생성자
 *          - 초기화블록
 *             인스턴스 초기화
 *             static 초기화
 *           
 *           사용순서
 *           class A
 *           {
 *              int a=10;    명시적 초기화 ① 
 *              
 *              {
 *              	a=100;   초기화블럭 ②
 *              }
 *              
 *              A(){
 *              	a=1000;   생성자 ③
 *              }
 *           }
 *           => 초기화블럭과 생성자는 같이 사용하는 빈도가 거의 없다
 *           
 *     2) 생성자
 *         - 멤버변수의 초기값 부여
 *         - 제어문 이용, 파일 읽기, 구현하고 데이터값 가지고 올 때, 보안
 *         - 생략 가능 => 자동으로 컴파일러가 추가  ==> default생성자 (매개변수가 없는 생성자)   
 *         - 메모리에 저장(클래스) ==> 호출되는 메소드
 *           ----------
 *           new 생성자() ==> 한 번만 호출 => this(자신)
 *           
 *           ※변수가 충돌할경우 => this사용
 *           class A
 *           {
 *           	int a;
 *           	A(int a)
 *              {
 *              	this.a=a;   => A클래스가 가지고있는 변수 a를 a에 대입
 *              }
 *           }   
 *     3) 메소드
 *         - 선언부, 구현부
 *         - 형식 :   리턴형 메소드명(메소드명..)  ==> 선언부
 *         			{
 *         				==> 구현부
 *         			} 
 *                  선언부+구현부 = 저장
 *                  - 인스턴스메소드 : 클래스마다 따로 사용하는 메소드
 *                  - 정적메소드 (static) : 모든 클래스 공통으로 사용되는 메소드
 *                  - 추상메소드 : 선언부만 존재(구현x) -> 프로그래머가 따로 구현해줌 (implements) 377page 
 */
class Student{
	// 학생 1명에 대한 정보 ==> 메모리 공간 여러개 만들 수 있음 (new)
	String name;
	String subject;
	int year;
	static String school; //메모리에 저장  
	/*
	Student(){  	==> default생성자
	}
	*/
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static 변수 사용
		Student.school="SIST";
		Student s=new Student(); // name,year,subject => 저장(s라는 주소에 저장)
		System.out.println(s);
		//Student@15db9742
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		
		s.name="홍길동";
		s.subject="개발과";
		s.year=3;
		// 메소드도 동일한 방법
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		
		
		Student s1=new Student();
		System.out.println(s1);
		//Student@6d06d69c => 저장공간 변경
		
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		
		s1.name="심청이";
		s1.subject="광고과";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		String ss1="1234567890";
		ss.replace('H', 'K'); //인스턴스메소드
		String.valueOf(10); // static 메소드 ==> 클래스이름.~
		Math.random(); // static메소드 
		
	}

}
