/*
 *     메소드 
 *     	 1) 자동으로 메모리에 저장 -> 정적메소드
 *            static 리턴형(결과값) 메소드명(매개변수..)
 *            {
 *           		return 값
 *            }
 *     	 2) 프로그래머가 메모리를 만든 후 저장 -> 인스턴스메소드
 *         ===> new 연산자를 이용하면 저장 가능
 *         ===> 프로그램의 중심
 *            리턴형(결과값) 메소드명(매개변수..)
 *            {
 *           		return 값
 *            }
 *    	  3) 메소드의 선언부만 사용 -> 추상메소드
 *            리턴형(결과값) 메소드명(매개변수..); => 추상클래스(인터페이스)
 *            
 *      1. 메소드 형태
 *         선언부 -> 메모리에 저장X
 *         구현부 -> 메모리에 저장O => 필요한 위치에서 사용 가능
 *         
 *         리턴형 메소드명(매개변수...) => 선언부
 *         {					  => 구현부	
 *         		가공(처리)
 *         		return 결과값
 *         }
 *         
 *         결과값이 없는 경우(void)에는 return 생략 가능
 *         => JVM => 자동으로 return 추가
 *         return : 메소드가 종료하는 시점 ==> 모든 메소드에는 return 존재
 *         
 *         - 리턴형(결과값)  ==> 결과값은 반드시 한 개만 설정
 *         					   기본형(정수, 실수..)
 *         					   데이터가 여러개일 경우 => 모아서 한번에 전송(배열,클래스)
 *         
 *         - 사용자 입력값(매개변수, 인자, 인수) ==> 사용자 요청값
 *         		한 개, 여러 개 모두 가능 ==> 매개변수는 3개 이상 초과X
 *         							  ------------------- 배열, 클래스
 *               => ex) 10명의 국어점수 평균 
 *                      (int a1, , ....,a10) => int[] kor
 *                      
 *         - return문 
 *         	  모든 메소드에서 반드시 사용 => 메소드 종료
 *           위치는 상관X
 *           예외) 결과값이 없는 경우에는 생략 가능
 *         
 */
// ※ 결과값(리턴값, 반환값)? 사용자로부터 받는 값(매개변수)?
/* 
*	 사용자로부터 정수를 입력받아서 해당 구구단 출력
*   	1) 결과값(O), 매개변수(O) => 구구단을 묶어서 넘겨준다
*    		String
*   	2) 결과값(X), 매개변수(O) => 메소드 안에서 출력  **
*   		void
*/
// 메소드는 클래스안에서 만든다
// 메소드안에 메소드는 선언할 수 없다
// 다른 클래스에서도 사용 가능

import java.util.*;
public class 자바메소드1 {
	static String gugudan1(int dan)
	{
		//출력
		String gu="";
		for(int i=1;i<=9;i++)
		{
			gu+=dan+"*"+i+"="+dan*i+"\n";		
		}	
		return gu;
	}
	
	static void gugudan2(int dan) // 데이터형이 다르면 같은 이름 사용가능(오버로딩)
	{
		//전체 처리 ==> 출력
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int dan=scan.nextInt();
		구구단을 출력할 메소드 호출 => 호출할 때마다 처음부터 종료까지 반복해서 수행
		gugudan2(dan);
		*/
		
		//String s=gugudan1(9); // 메소드 수행 후에 결과값을 넘겨주고 다음문장으로 넘어감
		//System.out.println(s);
		for(int i=2;i<=9;i++)
		{
			String gu=gugudan1(i); // 반복적인 기능의 제거
			System.out.println(gu);
		}
		return;
		

		
		
		
		
		
		
		
		
	}

}
