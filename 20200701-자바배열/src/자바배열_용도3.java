// 사용자가 입력 (정수) ===> 2진법 출력
// bit => 16bit ==> 32767
// 17개 변수 ==> 0 or 1 16개 + 사용자 입력값 1개
// 10 = 0000 0000 0000 1010  
//        -------------------> 같은용도 => 배열사용
/*
 *   사용법
 *     제어문
 *     조건
 *     반복  = for (횟수 지정 => 자동 종료)
 *         = while (종료시점을 반드시 입력) => break;
 *     연산자 독립적 사용 => 산술, 대입  
 *     		조건문 사용 => 비교, 부정, 논리 
 */
import java.util.*;
public class 자바배열_용도3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		//0, 1만 저장
		//사용자가 요청한 정수
		int user=0;
		int index=15; // 뒤에서부터 출력 ==> 배열 제어
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		user=scan.nextInt();
		
		System.out.println("==== Lib이용 ====");
		System.out.println(Integer.toBinaryString(user));
		
		
		// while=> 사용자가 입력한 수에 따라 2로 나누는 횟수가 달라짐 => 횟수지정안됨
		while(true) // 종료시점 when? => break
		{
			binary[index]=user%2;
			user=user/2;
			if(user==0)break;
			index--;
		}
		
		// 결과 출력 
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			} // 4칸마다 공백
			
			System.out.print(binary[i]);
		}
		
		
		
		
	}

}
