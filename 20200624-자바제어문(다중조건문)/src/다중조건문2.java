// 각 달의 마지막 날짜 출력
// 6월 => 30일 / 7월 => 31일
/*
 *   31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
 *   중복=> 하나의 조건문으로 처리 ==> 총 3개의 조건문
 *   
 */
import java.util.*;
public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=0;
		
		// 사용자 입력값 받기
		Scanner scan=new Scanner(System.in);
		/*
		 *  정수 => nextInt()
		 *  문자열 => next(), nextLine()
		 *  실수 => nextDouble()
		 *  논리형 => nextBoolean()
		 */
		System.out.print("원하는 월을 입력(1~12):");
		// 메모리에 저장 => 변수
		month=scan.nextInt();
		
		// 가공 => 연산자, 제어문 ==> 메소드
		/*
		if(month==1)
			System.out.println("1월은 31일까지 있습니다");
		else if(month==2)
			System.out.println("2월은 28일까지 있습니다");
		else if(month==3)
			System.out.println("3월은 31일까지 있습니다");
		else if(month==4)
			System.out.println("4월은 30일까지 있습니다");
		else if(month==5)
			System.out.println("5월은 31일까지 있습니다");
		else if(month==6)
			System.out.println("6월은 30일까지 있습니다");
		else if(month==7)
			System.out.println("7월은 31일까지 있습니다");
		else if(month==8)
			System.out.println("8월은 31일까지 있습니다");
		else if(month==9)
			System.out.println("9월은 30일까지 있습니다");
		else if(month==10)
			System.out.println("10월은 31일까지 있습니다");
		else if(month==11)
			System.out.println("11월은 30일까지 있습니다");
		else if(month==12)
			System.out.println("12월은 31일까지 있습니다");
		*/
		
		if( month==4 || month==6 || month==9 || month==11) {
			System.out.println(month+"월은 30일까지 있습니다");
			
		}
		else if(month==2) {
			System.out.println(month+"월은 28일까지 있습니다");
		}
		else {
			System.out.println(month+"월은 31일까지 있습니다"); //조건이 많은부분 => else
		}
		
	}

}

