/*
 *   사용자 정수입력=> 짝수, 홀수 (void)
 *   메소드 2개 (입력받는값, 짝/홀 판단)
 *   
 *   메소드 => 결과값을 받음 ==> return 
 *   		  메소드 자체에서 출력 ==> void(return값 X) 
 *   
 *   
 */
import java.util.*;
public class 자바메소드3 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		return num;
	}
	static void process(int num)
	{
		if(num%2==0)
			System.out.println(num+"는 짝수입니다");
		else
			System.out.println(num+"는 홀수입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=userInput();
		
		process(num);
		

	}

}
