import java.util.Scanner;

public class 연습문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("두 자리수의 정수 입력:");
		int a=scan.nextInt();
		
		if(a%11==0)
		//내답 : if(a/10==(a-(a/10)*10))
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		/*
		String a;
		a=scan.next();
		if(a.charAt(0)==a.charAt(1))
		*/
		
		/*
		 *  변수 ==> 한 개의 데이터만 저장
		 *          정수, 실수, 문자, true/false
		 *          ==> 메모리 크기 설정
		 *              ------------
		 *               자바에서 메모리 크기 지원 ==> 기본형
		 *          ==> 데이터형(자료형) 
		 */
		
		
		
		
		
		
		
		
		
		
	}
}
