
public class MainClass1 {
	public static void main(String[] args) {
		 // 표현 => 자바
		/*
		 *    정수
		 *      = 10진법  10,20..
		 *      = 8진법(0)
		 *           011 => 9
		 *           =
		 *      = 16진법(0x)
		 *           0x10
		 *           ==
		 *      = 2진법(0b)
		 *           0b1010
		 *           ==
		 *    실수
		 *      = 저장 크기 => 4byte (소수점이하 8자)  10.5f or 10.5F (대소문자 구분x)
		 *      = 저장 크기 => 8byte (소수점이하 16자) 10.5d (d는 생략가능)
		 *    문자
		 *      = ' ' => 한글자만 저장!(한글사용도 가능)
		 *    문자열
		 *      = " " => 여러글자 저장
		 *      
		 *      ASC (c) =======> 1byte
		 *      Unicode (자바) => 2byte
		 *      
		 *      UTF-8 ==> 2byte로 변환하는것(한글이 깨지지 않음)
		 *      
		 *      
		 */
		System.out.println('홍');
		System.out.println("Hello");
		
		System.out.println(10.5);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10);// 명령프롬프트에 10을 출력
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		/*
		 *   1. 기본 문법
		 *   ============
		 *     => 대소문자 구분
		 *        => 라이브러리 (클래스:대소문자  System, 메소드:소문자 println, 상수:모두 대문자)
		 *        PI=3.14
		 *        
		 *        변수/상수  상수보다 변수가 많음
		 *        final이 있으면 상수, 없으면 변수 (대문자가 모두 상수는 아님)
		 *        int kor=100;
		 *        final int KOR=200;
		 *      
		 *      => 명령문이 종료되면 반드시 ; 사용
		 *      
		 *      
		 *    3. 들여쓰기
		 *      
		 */
		
	}
}
